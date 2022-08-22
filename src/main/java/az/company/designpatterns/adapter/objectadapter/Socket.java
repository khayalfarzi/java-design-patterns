package az.company.designpatterns.adapter.objectadapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
