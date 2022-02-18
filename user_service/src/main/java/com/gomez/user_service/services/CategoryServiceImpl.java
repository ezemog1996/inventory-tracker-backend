package com.gomez.user_service.services;

import com.gomez.user_service.models.Category;

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
