package com.bootcamp.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ShapeTestSuite {
    private static int testCounter = 1;

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
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2);

        //When
        shapeCollector.addFigure(shape);

        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2, 3, 4);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertTrue(result);
    }

    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2, 3, 4);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5);
        shapeCollector.addFigure(shape);

        //When
        Optional<Shape> optionalShape = shapeCollector.getFigure(0);

        //Then
        assertTrue(optionalShape.isPresent());
    }

    @Test
    public void testCircleFieldCalculating() {
        //Given
        Shape shape = new Circle(5);

        //When
        double result = shape.getField();

        //Then
        assertEquals(result, Math.PI * 5 * 5, 0);
    }

    @Test
    public void testSquareFieldCalculating() {
        //Given
        Shape shape = new Square(4);

        //When
        double result = shape.getField();

        //Then
        assertEquals(16, result, 0);
    }

    @Test
    public void testTriangleFieldCalculating() {
        //Given
        Shape shape = new Triangle(3, 4, 5);

        //When
        double result = shape.getField();

        //Then
        assertEquals(6, result, 0);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(5);
        shapeCollector.addFigure(shape1);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape1);

        // When
        String resultShapeList = shapeCollector.showFigures();

        // Then
        assertEquals(resultShapeList, shapeList.toString());
    }
}
