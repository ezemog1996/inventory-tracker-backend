package com.gomez.user_service.services;

import com.gomez.user_service.models.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    
    @Autowired
    public ItemServiceImpl() {
        super();
    }

    @Override
    public Item addItem(Item item) {
        return null;
    }
    
}