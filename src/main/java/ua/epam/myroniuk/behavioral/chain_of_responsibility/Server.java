package ua.epam.myroniuk.behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Server {
    private static Map<String, String> users = new HashMap<>();
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    // Server gets email and password from user and starts verification.
    public void logIn(String email, String password) {
        if (handler.check(email, password)) {
            System.out.println("Authorization have been successful!");
            // Here it should be some useful code for registered users
        } else {
            System.out.println("You have to register!");
        }
    }

    // register a new user
    public void register(String email, String password) {
        users.put(email, password);
    }

    // check if the user has already email
    public static boolean hasEmail(String email) {
        return users.containsKey(email);
    }
}
