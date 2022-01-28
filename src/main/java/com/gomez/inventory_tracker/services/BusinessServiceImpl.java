package com.gomez.inventory_tracker.services;

import com.gomez.inventory_tracker.daos.BusinessRepository;
import com.gomez.inventory_tracker.models.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    private BusinessRepository br;

    @Autowired
    public BusinessServiceImpl(BusinessRepository br) {
        super();
        this.br = br;
    }

    @Override
    public Business addBusiness(Business business) {
        return br.save(business);
    }
    
}
