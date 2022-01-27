package com.gomez.inventory_tracker.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable=false)
    private int itemId;
    @Column(nullable=false)
    private String itemName;
    @Column(nullable=false)
    private String itemDescription;
    @Column(nullable=false)
    private int itemCategory;
    @Column(nullable=false)
    private int itemLocation;
}
