package com.bootcamp.exception.airports;

import java.util.List;
import java.util.Map;

public class PossibleFlight {

    public static boolean isFlightPossible(Flight flight, Map<Airport, List<Airport>> destinations) {

        if (destinations.get(flight.getDepartueAirport()).contains(flight.getArrivalAirport())) {
            System.out.println("Flight is possible");
            return true;
        }
        for (Airport airport : destinations.get(flight.getDepartueAirport())) {
            if (isFlightPossible(new Flight(airport, flight.getArrivalAirport()), destinations)) {
                return true;
            }
        }
        System.out.println("Flight isn't possible");
        return false;

    }
}