package az.company.designpatterns.composite;

public class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.printf("Draw method for Circle class with color : %s\n", color);
    }
}
