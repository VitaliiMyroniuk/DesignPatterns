package ua.epam.myroniuk.behavioral.mediator;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class ConcreteUser implements User {
    Chat chat;
    String name;

    public ConcreteUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
