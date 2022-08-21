package az.company.designpatterns.factory;

public class CarFactory {

    public static Car getInstance(CarModel model, String engine, int speed, boolean turbo) {

        if (model.equals(CarModel.BMW))
            return new BMW(engine, speed, turbo);
        else if (model.equals(CarModel.MERCEDES))
            return new Mercedes(engine, speed, turbo);
        else throw new RuntimeException("CAR_MODEL_NOT_FOUND");

    }
}
