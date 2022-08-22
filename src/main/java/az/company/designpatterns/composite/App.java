package az.company.designpatterns.composite;

public class App {

    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();

        drawing.addShape(triangle);
        drawing.addShape(circle);

        drawing.draw("RED");
    }
}