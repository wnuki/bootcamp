package com.bootcamp.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShapeCollector {
    private List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Optional<Shape> getFigure(int n) {
        return shapeCollection.size() >= n ? Optional.of(shapeCollection.get(n)) : Optional.empty();
    }

    public String showFigures() {
        return shapeCollection.toString();
    }

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }
}
