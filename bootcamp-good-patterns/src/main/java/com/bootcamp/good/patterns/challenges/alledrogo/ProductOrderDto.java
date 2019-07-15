package com.bootcamp.good.patterns.challenges.alledrogo;

import java.time.LocalDateTime;

public class ProductOrderDto {
    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean isSold;

    public ProductOrderDto(final User user, final LocalDateTime orderDate, final Product product, final int quantity, final boolean isSold) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}