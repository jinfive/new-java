package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Member업데이트하나수정2 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        //1.mongclinet생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member  = db.getCollection("member");
        System.out.println("member컬랙션 까지 연결 성공");

        //3. 전송할 js 생성
        Document filter = new Document();
        filter.append("id","kim");

        Bson pw = Updates.set("pw","0000");
        Bson name = Updates.set("name","kwungoh");

        List<Bson> list = new ArrayList<>();
        list.add(pw);
        list.add(name);

        Bson all = Updates.combine(list);



        //4. 전송 ,결과 처리
      member.updateOne(filter, all);


        //연결종료
        client.close();
        System.out.println("good bye~~~");

    }
}
