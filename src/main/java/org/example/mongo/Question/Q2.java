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

public class Q2 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("item");
        
// 블로그 서비스에서 회원 아이디로 삭제
        Document query = new Document("category", "Clothing").append("brand", "Nike");
        collection.deleteOne(query);

        mongoClient.close();
    }

}
