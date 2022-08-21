package az.company.designpatterns.adapter.classadapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt().getVolts(), 40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt().getVolts(), 10);
    }

    @Override
    public Volt get120Volt() {
        return convertVolt(getVolt().getVolts(), 1);
    }

    private Volt convertVolt(int volt, int temp) {
        return new Volt(volt / temp);
    }
}
