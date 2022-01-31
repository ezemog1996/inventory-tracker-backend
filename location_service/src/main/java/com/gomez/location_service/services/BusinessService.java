package com.gomez.location_service.services;

import java.util.List;

import com.gomez.location_service.dtos.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
