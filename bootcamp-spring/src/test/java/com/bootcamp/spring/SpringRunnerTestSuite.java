package com.bootcamp.spring;

import com.bootcamp.spring.shape.Circle;
import com.bootcamp.spring.shape.Shape;
import com.bootcamp.spring.shape.Square;
import com.bootcamp.spring.shape.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.bootcamp.spring.shape");
        Shape shape = context.getBean(Circle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }
    @Test
    public void testTriangleLoadedIntoContainer() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.bootcamp.spring.shape");
        Shape shape = context.getBean(Triangle.class);

        //When
        String name = shape.getShapeName();

        //Then

        assertEquals("This is a triangle.", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.bootcamp.spring.shape");
        Shape shape = context.getBean(Square.class);

                        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.bootcamp.spring.shape");
        Shape shape = (Shape) context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }
}