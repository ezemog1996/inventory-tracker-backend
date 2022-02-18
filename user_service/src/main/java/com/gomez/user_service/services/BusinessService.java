package com.gomez.user_service.services;

import java.util.List;

import com.gomez.user_service.models.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
