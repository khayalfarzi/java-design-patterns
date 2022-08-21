package az.company.designpatterns.builder;

public class Person {

    private final Long id;
    private final String name;
    private final String surname;
    private final byte age;
    private final String gender;

    private Person(builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class builder {

        private Long id;
        private String name;
        private String surname;
        private byte age;
        private String gender;

        public builder() {
        }

        public builder id(Long id) {
            this.id = id;
            return this;
        }

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public builder age(byte age) {
            this.age = age;
            return this;
        }

        public builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
