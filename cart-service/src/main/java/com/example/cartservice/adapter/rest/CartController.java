package com.example.cartservice.adapter.rest;

import com.example.cartservice.adapter.rest.dto.CartDTO;
import com.example.cartservice.adapter.rest.dto.ItemDTO;
import com.example.cartservice.model.Cart;
import com.example.cartservice.model.Item;
import com.example.cartservice.service.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    private final ModelMapper modelMapper;


    public CartController(CartService cartService, ModelMapper modelMapper) {
        this.cartService = cartService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public Cart createCart() {

        return cartService.creatCart();
    }

    @GetMapping("/{cartId}")
    public CartDTO getCart(@PathVariable("cartId") String id ){

        //TODO
        return null;
    }

    @GetMapping("/getItems")
    public Page<CartDTO> allItems(
            @RequestParam(name = "Page Index" , defaultValue = "0" ,required = false) int pageIndex,
            @RequestParam(name = "Page Size" , defaultValue = "10",required = false) int pageSize
    ){


        //TODO
        // reutrn cartService .loadItems(pageindex,pagesize).map(this::MapToDTO)
        return null;
    }

    private CartDTO mapToDTO(Cart cart){
        return modelMapper.map(cart,CartDTO.class);
    }

    private Cart mapToModel(@RequestBody @Valid CartDTO cartDTO){
        return  modelMapper.map(cartDTO,Cart.class);
    }

    private ItemDTO mapToItemDTO(Item item){
        return modelMapper.map(item,ItemDTO.class);
    }

    private Item mapToModelItem(@RequestBody @Valid ItemDTO itemDTO){
        return  modelMapper.map(itemDTO,Item.class);
    }

}
