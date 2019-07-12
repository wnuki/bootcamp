package com.bootcamp.testing.shape;

public class Triangle implements Shape{
    private static final String NAME = "Triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        double p;

        p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
