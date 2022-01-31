package com.gomez.item_service.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int itemId;
    @Column(nullable = false)
    private String itemName;
    @Column(nullable = false)
    private String itemDescription;
    @Column(nullable = false)
    private int categoryId;
    @Column(nullable = false)
    private int locationId;
    @Column(nullable = false)
    private int businessId;
}
