package com.bootcamp.stream.sand;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {

        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigInteger totalSand = BigInteger.ZERO;
        for(SandStorage continent : continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        BigInteger expectedSand = new BigInteger("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {

        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigInteger totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigInteger expectedSand = new BigInteger("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }
}
