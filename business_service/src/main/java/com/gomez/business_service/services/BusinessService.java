package com.gomez.business_service.services;

import java.util.List;

import com.gomez.business_service.models.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
