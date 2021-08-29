package com.example.trip_service.service;

import com.example.trip_service.entity.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

public interface tripService {
    Trip create(Trip trip);
    Trip findOne(String id);
    List<Trip> findAll(int page , int size);
    Trip update(Trip trip);
    String DeleteById(String id);
    Trip findByCustomerId(String id);
}
