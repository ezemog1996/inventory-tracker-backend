package com.gomez.inventory_tracker.controllers;

import com.gomez.inventory_tracker.models.Business;
import com.gomez.inventory_tracker.services.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/businesses")
@CrossOrigin(origins = "*")
public class BusinessController {
    
    private BusinessService bs;

    @Autowired
    public BusinessController(BusinessService bs) {
        super();
        this.bs = bs;
    }

    @PostMapping("/add")
    public ResponseEntity<Business> addBusiness(@RequestBody Business business) {
        return new ResponseEntity<>(bs.addBusiness(business), HttpStatus.CREATED);
    }
}
