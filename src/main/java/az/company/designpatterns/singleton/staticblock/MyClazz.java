package az.company.designpatterns.singleton.staticblock;

public class MyClazz {

    private static MyClazz INSTANCE;

    /**
     * Static block initialization implementation is similar to eager initialization,
     * except that instance of class is created in the static block that provides option for exception handling.
     * */
    static {
        try {
            INSTANCE = new MyClazz();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private MyClazz() {
    }

    public static MyClazz getInstance() {
        return INSTANCE;
    }
}
