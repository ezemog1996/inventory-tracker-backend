package com.gomez.business_service.models;

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
@Table(name = "businesses")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int businessId;
    @Column(nullable = false)
    private String businessName;
    @Column(nullable = false)
    private String businessAddress;
    @Column(nullable = false)
    private String businessCity;
    @Column(nullable = false)
    private String businessState;
    @Column(nullable = false)
    private String businessZip;
}
