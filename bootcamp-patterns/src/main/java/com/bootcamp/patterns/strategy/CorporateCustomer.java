package com.bootcamp.patterns.strategy;

import com.bootcamp.patterns.strategy.predictor.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
