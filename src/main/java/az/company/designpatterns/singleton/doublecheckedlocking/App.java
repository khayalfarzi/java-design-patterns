package az.company.designpatterns.singleton.doublecheckedlocking;

public class App {

    public static void main(String[] args) {
        MyClazz clazz = MyClazz.getInstance();

        System.out.println(clazz);
    }
}
