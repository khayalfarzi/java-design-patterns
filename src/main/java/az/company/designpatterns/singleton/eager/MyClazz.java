package az.company.designpatterns.singleton.eager;

public class MyClazz {

    private static final MyClazz INSTANCE = new MyClazz();

    private MyClazz() {
    }

    public static MyClazz getInstance() {
        return INSTANCE;
    }
}
