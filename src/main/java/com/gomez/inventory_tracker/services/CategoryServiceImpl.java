package com.gomez.inventory_tracker.services;

import com.gomez.inventory_tracker.daos.CategoryRepository;
import com.gomez.inventory_tracker.models.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository cr;

    @Autowired
    public CategoryServiceImpl(CategoryRepository cr) {
        super();
        this.cr = cr;
    }

    @Override
    public Category addCategory(Category category) {
        return cr.save(category);
    }
    
}
