package com.bootcamp.good.patterns.challenges.food2Door;

import com.bootcamp.good.patterns.challenges.food2Door.providers.Provider;

import java.time.LocalDateTime;

public class OrderDto {
    private int orderNumber;
    private boolean isOrdered;
    private LocalDateTime orderTime;
    private Provider provider;
    private Product product;
    private int quantity;
    private String paymentMethod;

    public OrderDto(boolean isOrdered, int orderNumber, LocalDateTime orderTime, Provider provider, Product product, int quantity, String paymentMethod) {
        this.isOrdered = isOrdered;
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
