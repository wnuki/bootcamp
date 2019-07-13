package com.bootcamp.stream.world;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class WorldTest {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent neuropa = new Continent("Neuropa");
        neuropa.addCountry(new Country(new BigInteger("20000000"), "Poland"));
        neuropa.addCountry(new Country(new BigInteger("30000000"), "Holland"));
        neuropa.addCountry(new Country(new BigInteger("40000000"), "Trolland"));

        Continent nasia = new Continent("Nasia");
        nasia.addCountry(new Country(new BigInteger("1000"), "China"));
        nasia.addCountry(new Country(new BigInteger("2000"), "Kina"));
        nasia.addCountry(new Country(new BigInteger("3000"), "Trina"));

        Continent nafrica = new Continent("Nafrica");
        nafrica.addCountry(new Country(new BigInteger("100"), "Kongo"));
        nafrica.addCountry(new Country(new BigInteger("200"), "Tongo"));
        nafrica.addCountry(new Country(new BigInteger("300"), "Pongo"));

        World newWorld = new World();
        newWorld.addContinent(neuropa);
        newWorld.addContinent(nasia);
        newWorld.addContinent(nafrica);

        //When
        BigInteger result = newWorld.getPeopleQuantity();

        //Then
        assertEquals(new BigInteger("90006600"), result);
    }
}