package com.gomez.category_service.controllers;

import java.util.List;

import com.gomez.category_service.consumers.BusinessConsumer;
import com.gomez.category_service.models.Business;
import com.gomez.category_service.models.Category;
import com.gomez.category_service.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategoryController {
    
    private CategoryService cs;
    private BusinessConsumer bc;

    @Autowired
    public CategoryController(CategoryService cs, BusinessConsumer bc) {
        super();
        this.cs = cs;
        this.bc = bc;
    }

    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        return new ResponseEntity<>(cs.addCategory(category), HttpStatus.CREATED);
    }

    @GetMapping("/businesses")
    public ResponseEntity<List<Business>> getBusinesses() {
        return new ResponseEntity<>(bc.getBusinesses(), HttpStatus.OK);
    }
}
