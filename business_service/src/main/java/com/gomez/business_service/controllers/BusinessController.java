package com.gomez.business_service.controllers;

import java.util.List;

import com.gomez.business_service.models.Business;
import com.gomez.business_service.services.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



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

    @PostMapping
    public ResponseEntity<Business> addBusiness(@RequestBody Business business) {
        return new ResponseEntity<>(bs.addBusiness(business), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Business>> getBusinesses() {
        return new ResponseEntity<>(bs.getBusinesses(), HttpStatus.OK);
    }
    
}
