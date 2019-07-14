package com.bootcamp.good.patterns.challenges.food2Door;

import com.bootcamp.good.patterns.challenges.food2Door.providers.Provider;
import java.time.LocalDateTime;

public class Order {

    private int orderNumber;
    private LocalDateTime orderTime;
    private Provider provider;
    private Product product;
    private int quantity;
    private String paymentMethod;

    public Order(int orderNumber, LocalDateTime orderTime, Provider provider, Product product, int quantity, String paymentMethod) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
