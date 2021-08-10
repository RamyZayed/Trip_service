package com.example.trip_service.controller;

import com.example.trip_service.entity.Trip;
import com.example.trip_service.service.tripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class tripController {

    @Autowired
    tripService service;


    @PostMapping()
    public Trip create(@RequestBody Trip trip){
       return service.create(trip);
    }

    @GetMapping("/{id}")
    public Trip findOne(@PathVariable String id){
        return service.findOne(id);
    }

    @GetMapping()
    public List<Trip> findOne(@RequestParam int page, @RequestParam int size) {
        return service.findAll(page,size);
    }


    @PatchMapping()
    public Trip update(@RequestBody Trip t){
        return service.update(t);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return service.DeleteById(id);
    }



}
