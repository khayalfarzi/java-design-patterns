package az.company.designpatterns.adapter.classadapter;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
