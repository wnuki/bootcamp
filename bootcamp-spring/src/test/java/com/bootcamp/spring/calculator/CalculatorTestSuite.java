package com.bootcamp.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        double a = 10;
        double b = 5;

        //When
        double resultAdd = calculator.add(a, b);
        double resultSub = calculator.sub(a, b);
        double resultMul = calculator.mul(a, b);
        double resultDiv = calculator.div(a, b);

        //Then
        assertEquals(15, resultAdd, 0);
        assertEquals(5, resultSub, 0);
        assertEquals(50, resultMul, 0);
        assertEquals(2, resultDiv, 0);
    }

}