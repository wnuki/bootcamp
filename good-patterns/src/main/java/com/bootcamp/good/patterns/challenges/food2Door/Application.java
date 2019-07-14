package com.bootcamp.good.patterns.challenges.food2Door;

import com.bootcamp.good.patterns.challenges.food2Door.providers.Provider;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        OrderSample orders = new OrderSample();
        List<Order> order = orders.retrieve();

        for (Order theOrder : order) {
            Provider provider = theOrder.getProvider();
            OrderDto orderDto = theOrder.getProvider().process(theOrder);

            if (orderDto.isOrdered()) {
                System.out.println("Order no: " + orderDto.getOrderNumber()
                        + "\n------------------------------"
                        + "\ndate of order: " + orderDto.getOrderTime().format(DateTimeFormatter.ISO_DATE) + ", time: " + orderDto.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                        + "\nproducts ordered: " + orderDto.getProduct().getName()
                        + "\nquantity: " + orderDto.getQuantity()
                        + "\nprovider: " + provider.getProviderName() + "\n" + "\n");
            }
        }
    }
}
