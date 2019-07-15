package com.bootcamp.testing.shape;

public class Circle implements Shape {
    private static final String NAME = "circle";
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }
}
