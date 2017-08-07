package ua.epam.myroniuk.creational.builder.immutable_class_version;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    // private constructor
    private Person() {}

    // getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // get a new Builder
    public static Builder getBuilder() {
        return new Person().new Builder();
    }

    @Override
    public String toString() {
        return String.format(" Name: %s\n Surname: %s\n Age: %d", name, surname, age);
    }

    public class Builder {
        // private constructor
        private Builder() {}

        public Builder setName(String name) {
            Person.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            Person.this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            Person.this.age = age;
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}
