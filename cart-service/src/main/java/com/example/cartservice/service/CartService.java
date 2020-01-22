package com.example.cartservice.service;


import com.example.cartservice.adapter.repository.CartRepository;
import com.example.cartservice.adapter.rest.dto.CartDTO;
import com.example.cartservice.adapter.rest.dto.ItemDTO;
import com.example.cartservice.model.Cart;
import com.example.cartservice.model.Item;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
public class CartService {

        private final CartRepository cartRepository;
        private final ModelMapper modelMapper;

    public CartService(CartRepository cartRepository, ModelMapper modelMapper) {
        this.cartRepository = cartRepository;
        this.modelMapper = modelMapper;
    }

    public Cart creatCart(){
            return cartRepository.createCart();
    }




}
