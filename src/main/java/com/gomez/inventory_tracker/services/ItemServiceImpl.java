package com.gomez.inventory_tracker.services;

import javax.transaction.Transactional;

import com.gomez.inventory_tracker.daos.ItemRepository;
import com.gomez.inventory_tracker.models.Item;

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
