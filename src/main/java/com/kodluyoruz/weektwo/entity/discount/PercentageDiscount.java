package com.kodluyoruz.weektwo.entity.discount;

import com.kodluyoruz.weektwo.entity.cart.CartItem;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PercentageDiscount implements Discount{

    private final double discountAmount;

    public double getDiscountAmount() {
        return discountAmount/100;
    }

    @Override
    public double applyDiscount(CartItem cartItem) {

        double price = cartItem.getProduct().getPrice()* cartItem.getQuantity();
        double appliedDiscount = price*discountAmount;

        return price-appliedDiscount;
    }
}
