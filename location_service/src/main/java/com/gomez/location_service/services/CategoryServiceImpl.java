package com.gomez.location_service.services;

import com.gomez.location_service.dtos.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryServiceImpl() {
        super();
    }

    @Override
    public Category addCategory(Category category) {
        return null;
    }
    
}
