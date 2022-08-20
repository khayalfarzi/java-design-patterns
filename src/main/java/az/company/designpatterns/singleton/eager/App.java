package az.company.designpatterns.singleton.eager;

public class App {

    public static void main(String[] args) {
        MyClazz clazz = MyClazz.getInstance();

        System.out.println(clazz);
    }
}
