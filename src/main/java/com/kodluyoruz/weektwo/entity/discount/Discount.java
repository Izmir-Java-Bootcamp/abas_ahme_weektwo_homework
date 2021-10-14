package com.kodluyoruz.weektwo.entity.discount;

import com.kodluyoruz.weektwo.entity.cart.CartItem;

public interface Discount {

    double applyDiscount(CartItem cartItem);

}
