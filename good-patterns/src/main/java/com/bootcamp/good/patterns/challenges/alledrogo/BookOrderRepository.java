package com.bootcamp.good.patterns.challenges.alledrogo;

import java.time.LocalDateTime;
import java.util.Random;

public class BookOrderRepository implements ProductOrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }

}
