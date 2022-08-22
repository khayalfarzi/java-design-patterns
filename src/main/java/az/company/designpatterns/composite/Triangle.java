package az.company.designpatterns.composite;

public class Triangle implements Shape {

    @Override
    public void draw(String color) {
        System.out.printf("Draw method for Triangle class with color : %s\n", color);
    }
}
