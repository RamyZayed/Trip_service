package com.example.trip_service.repository;

import com.example.trip_service.entity.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tripRepository extends MongoRepository<Trip,String> {
}
