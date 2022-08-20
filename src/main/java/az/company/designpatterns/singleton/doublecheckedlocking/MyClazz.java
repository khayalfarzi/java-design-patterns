package az.company.designpatterns.singleton.doublecheckedlocking;

public class MyClazz {

    private MyClazz() {
    }

    private static final class InstanceHolder {
        private static final MyClazz INSTANCE = new MyClazz();
    }

    /**
     * To avoid this extra overhead every time, double checked locking principle is used.
     * In this approach, the synchronized block is used inside the if condition with an additional check to ensure
     * that only one instance of a singleton class is created.
     */
    public static synchronized MyClazz getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
