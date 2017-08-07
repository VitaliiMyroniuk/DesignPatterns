package ua.epam.myroniuk.creational.prototype;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class User implements Prototype {
    String name;
    String surname;
    int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype copy() {
        // implementation of the clone creation
        return new User(name, surname, age);
    }

    @Override
    public String toString() {
        return String.format("User \n name: %s\n surname: %s\n age: %d", name, surname, age);
    }
}
