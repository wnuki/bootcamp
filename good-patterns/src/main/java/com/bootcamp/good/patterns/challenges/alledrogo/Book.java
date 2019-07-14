package com.bootcamp.good.patterns.challenges.alledrogo;

import java.math.BigDecimal;

public class Book extends Product {
    private String title;

    public Book(String productName, BigDecimal productPrice, String title) {
        super(productName, productPrice);
        this.title = title;
    }
}