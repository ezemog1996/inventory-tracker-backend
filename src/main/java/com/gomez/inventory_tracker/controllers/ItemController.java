package com.gomez.inventory_tracker.controllers;

import com.gomez.inventory_tracker.models.Item;
import com.gomez.inventory_tracker.services.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
@CrossOrigin(origins = "*")
public class ItemController {
    
    ItemService is;

    @Autowired
    public ItemController(ItemService is) {
        super();
        this.is = is;
    }

    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return new ResponseEntity<>(is.addItem(item), HttpStatus.CREATED);
    }
}
