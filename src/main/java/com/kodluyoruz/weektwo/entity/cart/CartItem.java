package com.kodluyoruz.weektwo.entity.cart;

import com.kodluyoruz.weektwo.entity.discount.Discount;
import com.kodluyoruz.weektwo.entity.Product;
import com.kodluyoruz.weektwo.entity.Seller;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartItem {

    private Product product;
    private Seller seller;
    private int quantity;
    private Discount discount;

}
