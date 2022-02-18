package com.gomez.location_service.models;

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
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int locationId;
    @Column(nullable = false)
    private String locationName;
    @Column
    private String locationAddress;
    @Column
    private String locationCity;
    @Column
    private String locationState;
    @Column
    private String locationZip;
    @Column
    private int businessId;
}
