package com.gomez.category_service.services;

import javax.transaction.Transactional;

import com.gomez.category_service.daos.CategoryRepository;
import com.gomez.category_service.models.Category;

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
    @Transactional
    public Category addCategory(Category category) {
        return cr.save(category);
    }
    
}
