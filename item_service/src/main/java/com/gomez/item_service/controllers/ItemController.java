package com.gomez.item_service.controllers;

import com.gomez.item_service.models.Item;
import com.gomez.item_service.services.ItemService;

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
    
    private ItemService is;

    @Autowired
    public ItemController(ItemService is) {
        super();
        this.is = is;
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return new ResponseEntity<>(is.addItem(item), HttpStatus.CREATED);
    }
}
