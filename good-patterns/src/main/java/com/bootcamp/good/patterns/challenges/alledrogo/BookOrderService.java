package com.bootcamp.good.patterns.challenges.alledrogo;

import java.time.LocalDateTime;
import java.util.Random;

public class BookOrderService implements ProductOrderService{
    @Override
    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}
