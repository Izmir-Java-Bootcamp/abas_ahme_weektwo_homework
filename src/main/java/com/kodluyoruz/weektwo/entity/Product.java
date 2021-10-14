package com.kodluyoruz.weektwo.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private String productName;
    private double price;
}
