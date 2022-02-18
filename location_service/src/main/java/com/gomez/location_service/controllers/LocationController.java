package com.gomez.location_service.controllers;

import com.gomez.location_service.models.Location;
import com.gomez.location_service.services.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locations")
@CrossOrigin("*")
public class LocationController {

    private LocationService ls;

    @Autowired
    public LocationController(LocationService ls) {
        super();
        this.ls = ls;
    }
    
    @PostMapping
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        return new ResponseEntity<>(ls.addLocation(location), HttpStatus.CREATED);
    }
}
