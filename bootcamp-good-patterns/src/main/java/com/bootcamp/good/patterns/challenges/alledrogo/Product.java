package com.bootcamp.good.patterns.challenges.alledrogo;

import java.math.BigDecimal;

abstract class Product {
    private String productName;
    private BigDecimal price;

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "productName='" + productName + '\'' +
                ", price=" + price;
    }
}