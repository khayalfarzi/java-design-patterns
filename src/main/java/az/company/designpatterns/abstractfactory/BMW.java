package az.company.designpatterns.abstractfactory;

public class BMW extends Car {

    private final String engine;
    private final int speed;
    private final boolean turbo;

    public BMW(String engine, int speed, boolean turbo) {
        this.engine = engine;
        this.speed = speed;
        this.turbo = turbo;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean isTurbo() {
        return turbo;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "engine='" + engine + '\'' +
                ", speed=" + speed +
                ", turbo=" + turbo +
                '}';
    }
}
