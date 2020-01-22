package com.example.cartservice.adapter.repository.entity;

import com.example.cartservice.model.Item;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cartId;

    private String name;

    private String status;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "item_id")
    private List<ItemEntity> itemList;

}
