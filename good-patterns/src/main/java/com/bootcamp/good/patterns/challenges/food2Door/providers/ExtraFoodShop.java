package com.bootcamp.good.patterns.challenges.food2Door.providers;

import com.bootcamp.good.patterns.challenges.food2Door.Order;
import com.bootcamp.good.patterns.challenges.food2Door.OrderDto;

import java.math.BigDecimal;

public class ExtraFoodShop implements Provider {
    private static final String NAME = "ExtraFoodShop";

    @Override
    public String getProviderName() {
        return NAME;
    }

    @Override
    public OrderDto process(Order order) {
        BigDecimal minimalOrderValue = new BigDecimal("30");
        BigDecimal actualOrderValue = order.getProduct().getPrice().multiply(new BigDecimal(order.getQuantity()));

        if (actualOrderValue.compareTo(minimalOrderValue) <= 0) {
            System.out.println("Your order cannot be processed. Your order have to be over 30 PLN.\n");
            return new OrderDto(false,
                    order.getOrderNumber(),
                    order.getOrderTime(),
                    order.getProvider(),
                    order.getProduct(),
                    order.getQuantity(),
                    order.getPaymentMethod());
        } else {
            System.out.println("Your order is beeing processed");
            return new OrderDto(true,
                    order.getOrderNumber(),
                    order.getOrderTime(),
                    order.getProvider(),
                    order.getProduct(),
                    order.getQuantity(),
                    order.getPaymentMethod());
        }
    }

}

