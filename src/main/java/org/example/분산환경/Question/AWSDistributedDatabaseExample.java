package org.example.분산환경.Question;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.Statement;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AWSDistributedDatabaseExample {
    private static final String MySQL = "jdbc:mysql://127.0.0.1:3306/aws";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //몽고디비
    private static final String Mongo = "mongodb://127.0.0.1:27017";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mycon = DriverManager.getConnection(MySQL, USER, PASSWORD);
            System.out.println("Connected to MySQL.");

            String insertUserSQL = "INSERT INTO users (name, email, signup_date) VALUES (?, ?, ?)";
            PreparedStatement ps = mycon.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, "kjo");
            ps.setString(2, "kjo@gmail.com");
            ps.setString(3, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            ps.executeUpdate();

            ResultSet re = ps.getGeneratedKeys();
            int id = 0;
            if (re.next()) {
                id = re.getInt(1);
            }
            System.out.print("자동생성된 id>>" + id);
            System.out.println();
            //   3-1. mongodb에 연결
            MongoClient client = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = client.getDatabase("aws");
            MongoCollection<Document> logCollection = mongoDatabase.getCollection("activity_logs");
            System.out.println("Connected to MongoDB.");
            System.out.println("3. 몽고db연결");


            Document activityLog = new Document();
            activityLog.append("id", id);
            activityLog.append("user", "kjo");
            activityLog.append("user", "kjo@gmail.com");
            activityLog.append("timestamp", "2024-11-20");

            Document activityLog2 = new Document();
            activityLog.append("id", id);
            activityLog.append("user", "kjo2");
            activityLog.append("user", "kjo0829@gmail.com");
            activityLog.append("timestamp", "2024-11-20");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);

            System.out.println("Inserted order for user ID: " + id);
            System.out.println("4. 몽고db에 전송");

            //4-1. 회원정보는 mysql검색
            String selectUserSQL = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectUserPs = mycon.prepareStatement(selectUserSQL);
            selectUserPs.setInt(1, id);
            ResultSet rs = selectUserPs.executeQuery();
            if (rs.next()) {
                System.out.println("userInfo");
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("email: " + rs.getString("email"));
                System.out.println("Signup Date: " + rs.getString("signup_date"));
            }

            Document doc = new Document("id", id);
            ArrayList<Document> res = logCollection.find(doc).into(new ArrayList<>());
            System.out.println("Activity Logs:");
            for(Document dd : res){
                System.out.println(dd);
            }

            mycon.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

