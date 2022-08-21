package az.company.designpatterns.abstractfactory;

public class App {

    public static void main(String[] args) {

        Car bmw = CarFactory.getInstance(new BMWFactory("2.0", 260, true));
        Car mercedes = CarFactory.getInstance(new MercedesFactory("4.4", 360, false));

        System.out.println(bmw);
        System.out.println(mercedes);
    }
}
