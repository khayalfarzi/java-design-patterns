package az.company.designpatterns.abstractfactory;

public class CarFactory {

    public static Car getInstance(CarAbstractFactory carAbstractFactory) {
        return carAbstractFactory.createCar();
    }
}
