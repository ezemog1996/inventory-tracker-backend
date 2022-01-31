package com.gomez.business_service.services;

import java.util.List;

import javax.transaction.Transactional;

import com.gomez.business_service.daos.BusinessRepository;
import com.gomez.business_service.models.Business;

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
    @Transactional
    public Business addBusiness(Business business) {
        return br.save(business);
    }

    @Override
    public List<Business> getBusinesses() {
        return br.findAll();
    }
    
}
