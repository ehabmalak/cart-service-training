package com.example.cartservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Cart {
    private String cartId;

    private String name;

    private String status;

    private List<Item> itemList;
}
