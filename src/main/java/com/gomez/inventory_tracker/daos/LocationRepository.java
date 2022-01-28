package com.gomez.inventory_tracker.daos;

import com.gomez.inventory_tracker.models.Location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    
}
