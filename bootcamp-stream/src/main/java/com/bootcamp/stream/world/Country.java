package com.bootcamp.stream.world;

import java.math.BigInteger;
import java.util.Objects;

public final class Country {
    private BigInteger peopleQuantity;
    private String name;

    public Country(BigInteger peopleQuantity, String name) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountry() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQuantity, country.peopleQuantity) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleQuantity, name);
    }
}
