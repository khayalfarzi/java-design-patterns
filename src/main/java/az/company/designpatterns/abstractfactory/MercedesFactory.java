package az.company.designpatterns.abstractfactory;

public class MercedesFactory implements CarAbstractFactory {

    private final String engine;
    private final int speed;
    private final boolean turbo;

    public MercedesFactory(String engine, int speed, boolean turbo) {
        this.engine = engine;
        this.speed = speed;
        this.turbo = turbo;
    }

    @Override
    public Car createCar() {
        return new Mercedes(engine, speed, turbo);
    }
}
