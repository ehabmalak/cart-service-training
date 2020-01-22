package com.example.cartservice.adapter.repository;


import com.example.cartservice.model.Cart;
import com.example.cartservice.model.Item;

import java.util.Optional;

public interface CartRepository {

    public Cart createCart();

    public Optional<Item> deleteItemFromCart(Item item);

    public Cart loadCart(String cartId);
}
