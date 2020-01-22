package com.example.cartservice.adapter.messages.inbound;

import com.example.cartservice.model.Cart;
import com.example.cartservice.service.CartService;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class CartListener {

    private final CartService cartService;

    public CartListener(CartService cartService) {
        this.cartService = cartService;
    }


    @StreamListener(CartInputChannel.INPUT)
    public void handleMessage(Cart item) {
        cartService.creatCart();
    }
}

