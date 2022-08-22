package az.company.designpatterns.adapter.objectadapter;

public class SocketAdapterImpl implements SocketAdapter {

    private final Socket socket = new Socket();

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt().getVolts(), 40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt().getVolts(), 10);
    }

    @Override
    public Volt get120Volt() {
        return convertVolt(socket.getVolt().getVolts(), 1);
    }

    private Volt convertVolt(int volt, int temp) {
        return new Volt(volt / temp);
    }
}
