package com.gomez.location_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private int categoryId;
    private int locationId;
    private int businessId;
}
