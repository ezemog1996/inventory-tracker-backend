package com.gomez.inventory_tracker.daos;

import com.gomez.inventory_tracker.models.Business;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer> {
    
}
