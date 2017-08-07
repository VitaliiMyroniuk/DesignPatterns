package ua.epam.myroniuk.creational.prototype;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", "Ivanov", 25);
        System.out.println(user);

        UserFactory userFactory = new UserFactory(user);
        User cloneUser = userFactory.cloneUser();
        System.out.println(cloneUser);
    }
}
