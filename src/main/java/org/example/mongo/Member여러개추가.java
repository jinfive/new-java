package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class Member여러개추가 {


    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.WARNING);

        //1.mongclinet생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬랙션 까지 연결 성공");

        //3. 전송할 js 생성
        Document document = new Document();
        document.append("id", "apple2");
        document.append("pw", "123456");
        document.append("name", "apple2");
        document.append("tel", "010101");

        Document document2 = new Document();
        document2.append("id", "apple3");
        document2.append("pw", "123456");
        document2.append("name", "apple3");
        document2.append("tel", "010101");

        List<Document> list = new ArrayList<>();
        list.add(document);
        list.add(document2);


        //4. 전송 ,결과 처리
        member.insertMany(list);

        //연결종료
        client.close();
        System.out.println("good bye~~~");

    }
}
