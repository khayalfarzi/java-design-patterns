package az.company.designpatterns.singleton.threadsafe;

public class MyClazz {

    private static MyClazz INSTANCE;

    private MyClazz() {
    }

    /**
     * Above implementation works fine and provides thread-safety but it reduces the performance because of the cost
     * associated with the synchronized method, although we need it only for the first few threads who might
     * create the separate instances
     */
    public static synchronized MyClazz getInstance() {
        if (INSTANCE == null)
            INSTANCE = new MyClazz();
        return INSTANCE;
    }
}
