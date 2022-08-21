package az.company.designpatterns.adapter.classadapter;

public class Volt {

    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolt(int volts) {
        this.volts = volts;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volts=" + volts +
                '}';
    }
}
