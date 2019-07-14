package com.bootcamp.good.patterns.challenges.alledrogo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("grazia", "Grazynka", "Kowalska");
        LocalDateTime orderDate = LocalDateTime.of(2019, 5, 20, 21, 25);
        Product product = new Book("book",
                new BigDecimal("23,45"), "The book");
        return new ProductOrderRequest(user, orderDate, product);
    }
}