package com.gomez.business_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private int locationId;
    private String locationName;
    private String locationAddress;
    private String locationCity;
    private String locationState;
    private String locationZip;
    private int businessId;
}
