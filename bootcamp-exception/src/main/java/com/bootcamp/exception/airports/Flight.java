package com.bootcamp.exception.airports;

import java.util.Objects;

public class Flight {
    private Airport departueAirport;
    private Airport arrivalAirport;

    public Flight(Airport departueAirport, Airport arrivalAirport) {
        this.departueAirport = departueAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartueAirport() {
        return departueAirport;
    }

    public Airport getArrivalAirport() {
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
        return "Flight{" +
                "departueAirport=" + departueAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}