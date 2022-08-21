package az.company.designpatterns.factory;

public class App {

    public static void main(String[] args) {

        Car bmw = CarFactory.getInstance(CarModel.BMW, "2.0", 260, true);
        Car mercedes = CarFactory.getInstance(CarModel.MERCEDES, "4.4", 360, false);

        System.out.println(bmw);
        System.out.println(mercedes);
    }
}
