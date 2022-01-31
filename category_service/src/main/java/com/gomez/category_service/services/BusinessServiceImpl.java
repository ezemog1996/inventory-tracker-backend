package com.gomez.category_service.services;

import java.util.List;

import com.gomez.category_service.dtos.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    public BusinessServiceImpl() {
        super();
    }

    @Override
    public Business addBusiness(Business business) {
        return null;
    }

    @Override
    public List<Business> getBusinesses() {
        return null;
    }
    
}
