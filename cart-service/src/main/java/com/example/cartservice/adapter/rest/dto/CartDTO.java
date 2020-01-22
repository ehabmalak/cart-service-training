package com.example.cartservice.adapter.rest.dto;

import com.example.cartservice.model.Item;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class CartDTO {

    @NotEmpty
    private String cartId;

    @NotEmpty
    private String name;

    @NotEmpty
    private String status;

    @NotEmpty
    private List<Item> itemList;
}
