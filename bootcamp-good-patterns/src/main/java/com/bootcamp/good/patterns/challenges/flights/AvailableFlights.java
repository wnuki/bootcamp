package com.bootcamp.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class AvailableFlights {
    Set<Flight> availableFlights = new HashSet<>();

    Set<Flight> addFlight(Flight flight) {
        availableFlights.add(flight);
        return new HashSet<Flight>(availableFlights);
    }

    Set<Flight> removeFlight(Flight flight) {
        if (availableFlights.contains(flight)) {
            availableFlights.remove(flight);
            return new HashSet<>(availableFlights);
        } else {
            System.out.println("There is no connection.");
            return new HashSet<>(availableFlights);
        }
    }

    @Override
    public String toString() {
        return "AvailableFlights{" +
                "availableFlights=" + availableFlights +
                '}';
    }
}
