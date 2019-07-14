package com.bootcamp.good.patterns.challenges.food2Door;

import com.bootcamp.good.patterns.challenges.food2Door.providers.ExtraFoodShop;
import com.bootcamp.good.patterns.challenges.food2Door.providers.GlutenFreeShop;
import com.bootcamp.good.patterns.challenges.food2Door.providers.HealthyShop;
import com.bootcamp.good.patterns.challenges.food2Door.providers.Provider;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderSample {

    public List<Order> retrieve() {
        List<Order> ordersList = new ArrayList<>();

        Provider extraFoodShop = new ExtraFoodShop();
        Provider glutenFreeShop = new GlutenFreeShop();
        Provider healthyShop = new HealthyShop();

        Product eggs = new Product("eggs", new BigDecimal("1"));
        Product bread = new Product("bread", new BigDecimal("4"));
        Product cheese = new Product("cheese", new BigDecimal("35"));

        ordersList.add(new Order(1, LocalDateTime.of(2018, 11, 1, 12, 23, 00),
                healthyShop, eggs, 20, "cash on delivery"));
        ordersList.add(new Order(2, LocalDateTime.of(2018, 11, 1, 22, 21, 34),
                glutenFreeShop, bread, 3, "cash on delivery"));
        ordersList.add(new Order(10053, LocalDateTime.of(2018, 11, 2, 12, 44, 44),
                extraFoodShop, cheese, 2, "credit card"));

        return new ArrayList<>(ordersList);
    }
}
