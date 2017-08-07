package ua.epam.myroniuk.behavioral.chain_of_responsibility;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class PasswordHandler extends Handler {
    @Override
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)) {
            return false;
        } else {
            return checkNext(email, password);
        }
    }
}
