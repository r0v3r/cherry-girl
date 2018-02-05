package com.foss.rover.cherrygirl.cherryserver.service;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseItemService {
    @Autowired
    private MongoDatabase database;

    public String test(){
        MongoCollection<Document> baby_clothes = database.getCollection("baby_clothes");
        FindIterable<Document> documents = baby_clothes.find();
        Document first = documents.first();
        return first.toJson();
    }
}
