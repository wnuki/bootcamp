package com.bootcamp.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    private String departueAirport;
    private String arrivalAirport;

    public Flight(String departueAirport, String arrivalAirport) {
        this.departueAirport = departueAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartueAirport() {
        return departueAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departueAirport, flight.departueAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departueAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight: " + departueAirport + " - " + arrivalAirport;
    }
}
