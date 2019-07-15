package com.bootcamp.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public void removeContinent(Continent continent) {
        continents.remove(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigInteger getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.countries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
