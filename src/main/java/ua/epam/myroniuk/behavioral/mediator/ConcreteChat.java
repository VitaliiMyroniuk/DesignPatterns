package ua.epam.myroniuk.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class ConcreteChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User concreteUser) {
        for (User user : users) {
            if (user != concreteUser){
                user.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
