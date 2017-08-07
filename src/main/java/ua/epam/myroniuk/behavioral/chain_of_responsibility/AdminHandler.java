package ua.epam.myroniuk.behavioral.chain_of_responsibility;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class AdminHandler extends Handler {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
        } else {
            System.out.println("Hello, user!");
        }
        return true;
    }
}
