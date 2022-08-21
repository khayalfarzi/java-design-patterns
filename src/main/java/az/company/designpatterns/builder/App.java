package az.company.designpatterns.builder;

public class App {

    public static void main(String[] args) {

        Person person = new Person.builder()
                .id(1L)
                .name("Khayal")
                .surname("Farziyev")
                .age((byte) 23)
                .gender("MALE")
                .build();

        System.out.println(person);
    }
}
