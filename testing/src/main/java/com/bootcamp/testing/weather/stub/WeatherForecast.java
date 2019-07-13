package com.bootcamp.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<Integer, Double> calculateForecast() {
        Map<Integer, Double> resultMap = new HashMap<>();

        for(Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
}
