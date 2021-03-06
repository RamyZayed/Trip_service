package com.example.trip_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.trip_service.repository")
@EnableEurekaClient
public class TripServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripServiceApplication.class, args);
    }

}
