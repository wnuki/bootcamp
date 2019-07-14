package com.bootcamp.good.patterns.challenges.food2Door.providers;

import com.bootcamp.good.patterns.challenges.food2Door.Order;
import com.bootcamp.good.patterns.challenges.food2Door.OrderDto;

public interface Provider {
    String getProviderName();

    OrderDto process(Order order);
}
