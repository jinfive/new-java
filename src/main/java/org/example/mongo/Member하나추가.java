package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class Member하나추가 {
    public static void main(String[] args) {

        //1.mongclinet생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member  = db.getCollection("member");
        System.out.println("member컬랙션 까지 연결 성공");

        //3. 전송할 js 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("id>>>>>");
        String id = sc.nextLine();
        System.out.print("pw>>>>>");
        String pw = sc.nextLine();
        System.out.print("name>>>>>");
        String name = sc.nextLine();
        System.out.print("tell>>>>>");
        String tell = sc.nextLine();
        Document document = new Document();
        document.append("id", id);
        document.append("pw",pw);
        document.append("name",name);
        document.append("tel",tell);


        //4. 전송 ,결과 처리
        member.insertOne(document);

        //연결종료
        client.close();
        System.out.println("good bye~~~");

    }
}
