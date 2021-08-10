package com.example.trip_service.service;

import com.example.trip_service.entity.Trip;
import com.example.trip_service.repository.tripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tripServiceImpl implements tripService {

    @Autowired
    tripRepository repository;

    @Override
    public Trip create(Trip trip) {
      return   repository.save(trip);
    }

    @Override
    public Trip findOne(String id) {
        return  repository.findById(id).get();
    }

    @Override
    public List<Trip> findAll(int page,int size) {
        Pageable result = PageRequest.of(page,size);
        return repository.findAll(result).toList();
    }

    @Override
    public Trip update(Trip trip) {
        return repository.save(trip);
    }

    @Override
    public String  DeleteById(String id) {
        repository.deleteById(id);
        return "Deleted!";

    }
}
