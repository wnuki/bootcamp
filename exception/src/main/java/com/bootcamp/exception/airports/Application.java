package com.bootcamp.exception.airports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Airport warsaw = new Airport("WAW");
        Airport berlin = new Airport("BER");
        Airport prague = new Airport("PRG");
        Airport porto = new Airport("OPO");
        Airport newYork = new Airport("JFK");
        Airport beijing = new Airport("PEK");
        Airport london = new Airport("LON");

        List<Airport> warsawDestinations = new ArrayList<>();
        warsawDestinations.add(berlin);
        warsawDestinations.add(prague);

        List<Airport> berlinDestinations = new ArrayList<>();
        berlinDestinations.add(warsaw);
        berlinDestinations.add(newYork);

        List<Airport> pragueDestinations = new ArrayList<>();
        pragueDestinations.add(warsaw);
        pragueDestinations.add(porto);

        List<Airport> portoDestinations = new ArrayList<>();
        portoDestinations.add(prague);
        portoDestinations.add(newYork);

        List<Airport> newYorkDestinations = new ArrayList<>();
        newYorkDestinations.add(porto);
        newYorkDestinations.add(beijing);
        newYorkDestinations.add(berlin);

        List<Airport> beijingDestinations = new ArrayList<>();
        beijingDestinations.add(newYork);

        Map<Airport, List<Airport>> destinations = new HashMap<>();
        destinations.put(warsaw, warsawDestinations);
        destinations.put(berlin, berlinDestinations);
        destinations.put(prague, pragueDestinations);
        destinations.put(porto, portoDestinations);
        destinations.put(beijing, beijingDestinations);
        destinations.put(newYork, newYorkDestinations);

        Flight flight = new Flight(warsaw, newYork);
        PossibleFlight.isFlightPossible(flight, destinations);
    }
}
