package com.gomez.category_service.services;

import java.util.List;

import com.gomez.category_service.models.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
