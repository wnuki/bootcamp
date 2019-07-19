package com.bootcamp.patterns.factory;

public class ShapeFactory {
    private static final String CIRCLE = "CIRCLE";
    private static final String SQUARE = "SQUARE";
    private static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", 4.50);
            case SQUARE:
                return new Square("The angular square", 7.0);
            case RECTANGLE:
                return new Rectangle("The long rectangle", 15.0, 2.50);
            default:
                return null;
        }
    }

    public static String getCIRCLE() {
        return CIRCLE;
    }

    public static String getSQUARE() {
        return SQUARE;
    }

    public static String getRECTANGLE() {
        return RECTANGLE;
    }
}
