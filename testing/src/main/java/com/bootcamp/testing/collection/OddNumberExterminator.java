package com.bootcamp.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for(Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
