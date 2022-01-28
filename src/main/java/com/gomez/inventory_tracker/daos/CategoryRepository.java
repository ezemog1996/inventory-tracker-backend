package com.gomez.inventory_tracker.daos;

import com.gomez.inventory_tracker.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
