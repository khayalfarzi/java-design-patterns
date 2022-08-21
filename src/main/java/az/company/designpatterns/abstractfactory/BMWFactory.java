package az.company.designpatterns.abstractfactory;

public class BMWFactory implements CarAbstractFactory {

    private final String engine;
    private final int speed;
    private final boolean turbo;

    public BMWFactory(String engine, int speed, boolean turbo) {
        this.engine = engine;
        this.speed = speed;
        this.turbo = turbo;
    }

    @Override
    public Car createCar() {
        return new BMW(engine, speed, turbo);
    }
}
