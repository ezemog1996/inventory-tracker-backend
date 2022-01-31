package com.gomez.item_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business {
    private int businessId;
    private String businessName;
    private String businessAddress;
    private String businessCity;
    private String businessState;
    private String businessZip;
}
