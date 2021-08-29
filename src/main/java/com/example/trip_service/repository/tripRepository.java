package com.example.trip_service.repository;

import com.example.trip_service.entity.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tripRepository extends MongoRepository<Trip,String> {

     @Query("{ \"customer_id\" : \"?0\" }" )
     Trip nativeFindCustomerId(String customer_id);
}
