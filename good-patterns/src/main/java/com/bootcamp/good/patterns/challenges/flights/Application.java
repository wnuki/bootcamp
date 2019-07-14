package com.bootcamp.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        AvailableFlights flightsDB = new AvailableFlights();
        flightsDB.addFlight(new Flight("WAW", "KRK"));
        flightsDB.addFlight(new Flight("WAW", "GDA"));
        flightsDB.addFlight(new Flight("GDA", "WAW"));
        flightsDB.addFlight(new Flight("GDA", "WRO"));
        flightsDB.addFlight(new Flight("KRK", "WAW"));
        flightsDB.addFlight(new Flight("KRK", "POZ"));
        flightsDB.addFlight(new Flight("WRO", "GDA"));

        FlightFinder finder = new FlightFinder(flightsDB);

        System.out.println("Searching for direct flights from Warsaw: ");
        System.out.println(finder.availableDirectFlightsFromAirport("WAW"));

        System.out.println("Searching for direct flights from Gdansk: ");
        System.out.println(finder.availableDirectFlightsToAirport("GDA"));

        System.out.println("Searching for direct flights from Wroclaw: ");
        System.out.println(finder.availableFlightsFromTo("WAW", "WRO"));

    }
}