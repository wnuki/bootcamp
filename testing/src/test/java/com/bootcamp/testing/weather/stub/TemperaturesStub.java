package com.bootcamp.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {
    @Override
    public Map<Integer, Double> getTemperatures() {
        Map<Integer, Double> stubResults = new HashMap<>();
        stubResults.put(0, 25.5);
        stubResults.put(1, 26.2);
        stubResults.put(2, 24.8);
        stubResults.put(3, 25.2);
        stubResults.put(4, 26.1);

        return stubResults;
    }
}
