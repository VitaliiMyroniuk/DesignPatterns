package ua.epam.myroniuk.creational.builder.immutable_class_version;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
       Person person = Person.getBuilder()
               .setName("Ivan")
               .setSurname("Ivanov")
               .setAge(25)
               .build();
        System.out.println(person);
    }
}
