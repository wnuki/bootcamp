package com.bootcamp.good.patterns.challenges.food2Door.providers;

import com.bootcamp.good.patterns.challenges.food2Door.Order;
import com.bootcamp.good.patterns.challenges.food2Door.OrderDto;

public class GlutenFreeShop implements Provider {
    private static final String NAME = "GlutenFreeShop";

    @Override
    public String getProviderName() {
        return NAME;
    }

    @Override
    public OrderDto process(Order order) {
        if (order.getQuantity() >= 100) {
            System.out.println("Your order cannot be processed. You have to order less products.\n");
            return new OrderDto(false,
                    order.getOrderNumber(),
                    order.getOrderTime(),
                    order.getProvider(),
                    order.getProduct(),
                    order.getQuantity(),
                    order.getPaymentMethod());
        } else {
            System.out.println("Your order is beeing processed.");
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
