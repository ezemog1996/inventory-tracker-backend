package com.gomez.item_service.services;

import java.util.List;

import com.gomez.item_service.dtos.Business;

public interface BusinessService {
    Business addBusiness(Business business);
    List<Business> getBusinesses();
}
