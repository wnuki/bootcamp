package com.bootcamp.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheese extends AbstractPizzaOrderDecorator {

    public ExtraCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra cheese";
    }
}
