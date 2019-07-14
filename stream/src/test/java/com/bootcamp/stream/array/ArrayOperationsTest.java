package com.bootcamp.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTest {

    @Test
    public void testGetAverage() {

        //Given
        int newArray[] = new int[]{1, 3, 5, 7, 6};

        //When
        double result = ArrayOperations.getAverage(newArray);

        //Then
        assertEquals(4.4, result, 0.01);

    }

    @Test
    public void testEmptyList() {
        // Given
        int newArray[] = new int[]{};

        // When
        double result = ArrayOperations.getAverage(newArray);

        // Then
        assertEquals(-1, result, 0.01);
    }
}