package com.gomez.location_service.services;

import java.util.List;

import com.gomez.location_service.models.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
