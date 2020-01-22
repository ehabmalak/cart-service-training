package com.example.cartservice.adapter.repository.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String itemNo;

    private String name;

    private int manId;

    private int qty;

    private int price;

    private String description;
}
