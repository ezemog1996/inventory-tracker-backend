package com.gomez.item_service.services;

import javax.transaction.Transactional;

import com.gomez.item_service.daos.ItemRepository;
import com.gomez.item_service.models.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository ir;
    
    @Autowired
    public ItemServiceImpl(ItemRepository ir) {
        super();
        this.ir = ir;
    }

    @Override
    @Transactional
    public Item addItem(Item item) {
        return ir.save(item);
    }
    
}
