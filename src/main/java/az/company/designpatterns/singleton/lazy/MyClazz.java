package az.company.designpatterns.singleton.lazy;

public class MyClazz {

    private static MyClazz INSTANCE;

    private MyClazz() {
    }

    /**
     * The above implementation works fine in case of the single-threaded environment but when it comes to
     * multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
     * It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
     */
    public static MyClazz getInstance() {
        if (INSTANCE == null)
            INSTANCE = new MyClazz();
        return INSTANCE;
    }
}
