package az.company.designpatterns.singleton.reflectionsingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) {
        MyClazz clazz = MyClazz.getInstance();
        MyClazz clazzTwo = null;

        Constructor[] constructors = MyClazz.getInstance().getClass().getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            //Below code will destroy the singleton pattern
            constructor.setAccessible(true);
            try {
                clazzTwo = (MyClazz) constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
            break;
        }

        System.out.println(clazz.hashCode());
        System.out.println(clazzTwo.hashCode());
    }
}
