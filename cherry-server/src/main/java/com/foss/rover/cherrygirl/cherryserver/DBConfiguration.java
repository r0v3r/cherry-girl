package com.foss.rover.cherrygirl.cherryserver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfiguration {
    private static final String DB_NAME = "cherrygirl";
    private static final String MONGO_HOST = "localhost";
    private static final int MONGO_PORT = 27017;

    @Bean
    public MongoDatabase getDatabase() {
        MongoClient client = new MongoClient(MONGO_HOST, MONGO_PORT);
        return client.getDatabase(DB_NAME);
    }
}
