package com.kodluyoruz.weektwo.entity.discount;

import com.kodluyoruz.weektwo.entity.cart.CartItem;

public class Buy2Take3 implements Discount{


    @Override
    public double applyDiscount(CartItem cartItem) {

        int discountQuantity  = cartItem.getQuantity()/3;
        double result = (cartItem.getQuantity()-discountQuantity )*cartItem.getProduct().getPrice();

        return result;
    }
}
