package com.bootcamp.testing.shape;

public class Square implements Shape {
    private final static String NAME = "Square";
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return a * a;
    }
}
