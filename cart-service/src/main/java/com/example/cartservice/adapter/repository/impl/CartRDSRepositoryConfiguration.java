package com.example.cartservice.adapter.repository.impl;

import com.example.cartservice.adapter.repository.CartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "com.training.rds",name = "enabled",matchIfMissing = true)
public class CartRDSRepositoryConfiguration {

    @Bean
    public CartRepository cartRepository(CartJPARepository cartJPARepository, ModelMapper modelMapper){
        return new CartRDSRepository(cartJPARepository,modelMapper);
    }
}
