package com.bootcamp.testing.collection;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testOddNumberExterminatorEmptyList() {
        //given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> numbers = new ArrayList<Integer>();

        //when
        int result = (oddNumberExterminator.exterminate(numbers)).size();

        //Then
        assertEquals(result, 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        //when
        int result = (oddNumberExterminator.exterminate(numbers)).size();

        //Then
        assertEquals(result, 50);
    }
}
