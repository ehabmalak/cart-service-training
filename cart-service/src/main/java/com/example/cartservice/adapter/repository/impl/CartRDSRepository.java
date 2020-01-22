package com.example.cartservice.adapter.repository.impl;

import com.example.cartservice.adapter.repository.CartRepository;
import com.example.cartservice.adapter.repository.entity.CartEntity;
import com.example.cartservice.adapter.repository.entity.ItemEntity;
import com.example.cartservice.model.Cart;
import com.example.cartservice.model.Item;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;

public class CartRDSRepository implements CartRepository {

    private final CartJPARepository cartJPARepository;

    private final ModelMapper modelMapper;

    public CartRDSRepository(CartJPARepository cartJPARepository, ModelMapper modelMapper) {
        this.cartJPARepository = cartJPARepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Cart createCart() {

        Cart cart = Cart
                .builder()
                .name("cart1")
                .status("Create")
                .itemList(null)
                .build();
        return mapToModel(cartJPARepository.save(mapToEntity(cart)));
    }

    @Override
    public Optional<Item> deleteItemFromCart(Item item) {
        return Optional.empty();
    }

    @Override
    public Cart loadCart(String cartId) {
        return null;
    }

    private CartEntity mapToEntity(Cart cart){
        return modelMapper.map(cart,CartEntity.class);
    }

    private Cart mapToModel(@RequestBody @Valid CartEntity cartEntity){
        return  modelMapper.map(cartEntity,Cart.class);
    }

    private ItemEntity mapToItemEntity(Item item){
        return modelMapper.map(item,ItemEntity.class);
    }

    private Item mapToModelItem(@RequestBody @Valid ItemEntity itemEntity){
        return  modelMapper.map(itemEntity,Item.class);
    }
}
