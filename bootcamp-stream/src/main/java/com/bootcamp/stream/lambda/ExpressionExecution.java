package com.bootcamp.stream.lambda;

public class ExpressionExecution {
    public void executionExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result: " + result);
    }
}
