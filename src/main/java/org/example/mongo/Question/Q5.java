package org.example.mongo.Question;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q5 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        //1.mongclinet생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member  = db.getCollection("item");

        //3. 전송할 js 생성
        Document filter = new Document("category", "Clothing");
        filter.append("price", new Document("$gte",30000));

        //4. 전송 ,결과 처리

        List<Document> res2 = member.find(filter).into(new ArrayList<>());
        for (Document doc : res2) {
            System.out.println(doc.getString("name"));
            Document query = filter.append("price", new Document("$gte", 30000));
            member.deleteMany(query);
        }


        //연결종료
        client.close();
        System.out.println("good bye~~~");

    }

}
