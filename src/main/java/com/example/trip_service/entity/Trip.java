package com.example.trip_service.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "trip")
public class Trip {

    @Id
    private String trip_id;

    private int price;
    private String customer_id;
    private String emp_id;
    private String from;
    private String destination;
}
