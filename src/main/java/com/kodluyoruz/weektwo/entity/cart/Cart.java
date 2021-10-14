package com.kodluyoruz.weektwo.entity.cart;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(CartItem cartItem){
        cartItems.add(cartItem);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}
