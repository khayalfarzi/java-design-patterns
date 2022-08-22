package az.company.designpatterns.composite;

import java.util.LinkedList;
import java.util.List;

public class Drawing implements Shape {

    private final List<Shape> shapes = new LinkedList<>();

    @Override
    public void draw(String color) {
        shapes.forEach(shape -> shape.draw(color));
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        shapes.clear();
    }
}
