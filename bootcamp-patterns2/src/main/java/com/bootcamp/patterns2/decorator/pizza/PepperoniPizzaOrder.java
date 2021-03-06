package com.bootcamp.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaOrder extends AbstractPizzaOrderDecorator {

    public PepperoniPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + pepperoni";
    }
}
