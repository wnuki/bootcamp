package com.bootcamp.stream;

import com.bootcamp.stream.beautifier.PoemBeautifier;
import com.bootcamp.stream.lambda.ExpressionExecution;
import com.bootcamp.stream.lambda.MathExpression;
import com.bootcamp.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecution expressionExecution = new ExpressionExecution();

        System.out.println("Calculating expressions with lambdas");
        expressionExecution.executionExpression(10, 5, (a, b) -> a + b);
        expressionExecution.executionExpression(10, 5, (a, b) -> a - b);
        expressionExecution.executionExpression(10, 5, (a, b) -> a * b);
        expressionExecution.executionExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecution.executionExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecution.executionExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecution.executionExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecution.executionExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Calculating expressions with anonymous class");
        calculating(10, 5, new MathExpression() {
            @Override
            public double calculateExpression(double a, double b) {
                return a + b;
            }
        });
        calculating(10, 5, new MathExpression() {
            @Override
            public double calculateExpression(double a, double b) {
                return a - b;
            }
        });
        calculating(10, 5, new MathExpression() {
            @Override
            public double calculateExpression(double a, double b) {
                return a * b;
            }
        });
        calculating(10, 5, new MathExpression() {
            @Override
            public double calculateExpression(double a, double b) {
                return a / b;
            }
        });

        System.out.println("---------------------------------------");
        System.out.println("Text beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("First Poem", poem -> poem.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Second Poem", poem -> poem.replace('o', (char) 64)));
        System.out.println(poemBeautifier.beautify("Third Poem", poem -> poem.substring(3)));
        System.out.println(poemBeautifier.beautify("Fourth Poem", poem -> poem.concat(", the very last one.")));

    }

    public static void calculating(double a, double b, MathExpression mathExpression) {
        System.out.println("Result: " + mathExpression.calculateExpression(a, b));
    }
}
