package com.gomez.category_service.services;

import com.gomez.category_service.dtos.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    public LocationServiceImpl() {
        super();
    }

    @Override
    public Location addLocation(Location location) {
        return null;
    }
    
}
