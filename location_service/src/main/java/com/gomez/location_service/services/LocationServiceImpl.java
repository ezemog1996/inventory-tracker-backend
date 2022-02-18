package com.gomez.location_service.services;

import com.gomez.location_service.daos.LocationRepository;
import com.gomez.location_service.models.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository lr;

    @Autowired
    public LocationServiceImpl(LocationRepository lr) {
        super();
        this.lr = lr;
    }

    @Override
    public Location addLocation(Location location) {
        return lr.save(location);
    }
    
}
