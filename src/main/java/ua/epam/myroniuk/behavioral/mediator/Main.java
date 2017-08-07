package ua.epam.myroniuk.behavioral.mediator;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteChat concreteChat = new ConcreteChat();        // Chat is Mediator

        User admin = new Admin(concreteChat, "Admin");
        User user1 = new ConcreteUser(concreteChat, "User 1");
        User user2 = new ConcreteUser(concreteChat, "User 2");

        concreteChat.setAdmin(admin);
        concreteChat.addUserToChat(user1);
        concreteChat.addUserToChat(user2);

        user1.sendMessage("Hi! I'm User 1!");
        System.out.println();
        admin.sendMessage("Hi! I'm Admin!");
    }
}
