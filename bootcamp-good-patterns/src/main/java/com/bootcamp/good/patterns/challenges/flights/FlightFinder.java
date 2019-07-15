package com.bootcamp.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private AvailableFlights availableFlights;

    public FlightFinder(AvailableFlights availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> availableDirectFlightsFromAirport(String departueAirport) {
        return availableFlights.availableFlights.stream()
                .filter(flight -> flight.getDepartueAirport().equals(departueAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableDirectFlightsToAirport(String arrivalAirport) {
        return availableFlights.availableFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableFlightsFromTo(String departueAirport, String arrivalAirport) {
        Set<Flight> list1 = availableFlights.availableFlights.stream()
                .filter(flight -> flight.getDepartueAirport().equals(departueAirport))
                .collect(Collectors.toSet());

        Set<Flight> list2 = availableFlights.availableFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        Set<Flight> availableFlightsFrom = new HashSet<>();

        for (Flight flight1 : list1) {
            for (Flight flight2 : list2) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartueAirport())) {
                    availableFlightsFrom.add(flight1);
                    availableFlightsFrom.add(flight2);
                }
            }
        }
        return availableFlightsFrom;
    }
}
