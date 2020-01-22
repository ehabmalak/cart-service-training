package com.example.cartservice.adapter.rest.dto;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class ItemDTO {
    @NotEmpty
    private String itemNo;

    @NotEmpty
    private String name;

    @Min(1)
    private int manId;

    private String description;

    @Min(0)
    private int qty;

    @Min(0)
    private int price;

}
