package com.bootcamp.good.patterns.challenges.alledrogo;

import java.time.LocalDateTime;

public interface ProductOrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product);
}