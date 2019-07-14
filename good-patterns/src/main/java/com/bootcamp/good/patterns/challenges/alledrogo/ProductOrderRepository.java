package com.bootcamp.good.patterns.challenges.alledrogo;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}
