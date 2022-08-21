package az.company.designpatterns.factory;

public class Mercedes extends Car {

    private final String engine;
    private final int speed;
    private final boolean turbo;

    public Mercedes(String engine, int speed, boolean turbo) {
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
        return "Mercedes{" +
                "engine='" + engine + '\'' +
                ", speed=" + speed +
                ", turbo=" + turbo +
                '}';
    }
}
