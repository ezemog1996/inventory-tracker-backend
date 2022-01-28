package com.gomez.inventory_tracker.services;

import com.gomez.inventory_tracker.daos.LocationRepository;
import com.gomez.inventory_tracker.models.Location;

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
