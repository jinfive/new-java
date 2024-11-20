package org.example.mongo.Question;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuestionFind1 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);
        //1.mongclinet생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member  = db.getCollection("memo");
        System.out.println("member컬랙션 까지 연결 성공");

        //3. 전송할 js 생성
        Document filter = new Document();
        filter.append("age",3);

        //4. 전송 ,결과 처리
        FindIterable<Document> res = member.find(filter);
        Document doc = res.first();
        System.out.println(doc.getString("name"));
        System.out.println(doc.getInteger("age"));
        System.out.println(doc.getString("office"));
        System.out.println(doc.getString("phone"));

        System.out.println("-------------------");
        List<Document> res2 = member.find(filter).into(new ArrayList<>());
        System.out.println(res2.get(0).getString("name"));
        System.out.println(res2.get(0).getInteger("age"));
        System.out.println(res2.get(0).getString("office"));
        System.out.println(res2.get(0).getString("phone"));

        //연결종료
        client.close();
        System.out.println("good bye~~~");



    }
}
