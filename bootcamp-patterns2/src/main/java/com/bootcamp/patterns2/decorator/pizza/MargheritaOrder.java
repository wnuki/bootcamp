package com.bootcamp.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MargheritaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(20);
    }

    @Override
    public String getDescription() {
        return "Pizza margherita";
    }
}
