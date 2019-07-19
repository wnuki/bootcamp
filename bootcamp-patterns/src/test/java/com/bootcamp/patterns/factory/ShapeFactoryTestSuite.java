package com.bootcamp.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle() {

        //Given
        ShapeFactory factory = new ShapeFactory();

        //When
        Shape circle = factory.makeShape(ShapeFactory.getCIRCLE());

        //Then
        assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testFactorySquare() {

        //Given
        ShapeFactory factory = new ShapeFactory();

        //When
        Shape square = factory.makeShape(ShapeFactory.getSQUARE());

        //Then
        assertEquals(28.0, square.getCircumference(), 0);
        assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle() {

        //Given
        ShapeFactory factory = new ShapeFactory();

        //When
        Shape rectangle = factory.makeShape(ShapeFactory.getRECTANGLE());

        //Then
        assertEquals(37.50, rectangle.getArea(), 0);
        assertEquals("The long rectangle", rectangle.getName());
    }
}