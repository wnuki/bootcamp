package com.bootcamp.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void margheritaExtraCheeseOrderCostTest() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void margheritaExtraCheeseOrderDescriptionTest() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza margherita + extra cheese", description);
    }

    @Test
    public void margheritaPepperoniExtraSoucePackageOrderCostTest() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaOrder();
        pizzaOrder = new PepperoniPizzaOrder(pizzaOrder);
        pizzaOrder = new ExtraSouce(pizzaOrder);
        pizzaOrder = new TakeAwayPackage(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(38), cost);
    }

    @Test
    public void margheritaPepperoniExtraSoucePackageDescriptionTest() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaOrder();
        pizzaOrder = new PepperoniPizzaOrder(pizzaOrder);
        pizzaOrder = new ExtraSouce(pizzaOrder);
        pizzaOrder = new TakeAwayPackage(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza margherita + pepperoni + extra souce + package", description);
    }
}