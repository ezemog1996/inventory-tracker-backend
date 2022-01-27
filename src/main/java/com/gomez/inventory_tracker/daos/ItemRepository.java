package com.gomez.inventory_tracker.daos;

import com.gomez.inventory_tracker.models.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    
}
