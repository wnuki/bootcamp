package com.bootcamp.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean
    public Shape chosenShape() {
        Shape shape;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            shape = new Triangle();
        } else if (chosen == 1) {
            shape = new Circle();
        } else {
            shape = new Square();
        }
        return shape;
    }
}
