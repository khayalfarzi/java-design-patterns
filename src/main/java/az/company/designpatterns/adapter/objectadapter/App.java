package az.company.designpatterns.adapter.objectadapter;

public class App {

    public static void main(String[] args) {

        SocketAdapter socketAdapter = new SocketAdapterImpl();

        System.out.printf("3 volt socket: %s\n", socketAdapter.get3Volt());
        System.out.printf("12 volt socket: %s\n", socketAdapter.get12Volt());
        System.out.printf("120 volt socket: %s\n", socketAdapter.get120Volt());
    }
}