package com.gomez.inventory_tracker.controllers;

import com.gomez.inventory_tracker.models.Category;
import com.gomez.inventory_tracker.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategoryController {
    
    private CategoryService cs;

    @Autowired
    public CategoryController(CategoryService cs) {
        super();
        this.cs = cs;
    }

    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        return new ResponseEntity<>(cs.addCategory(category), HttpStatus.CREATED);
    }
}
