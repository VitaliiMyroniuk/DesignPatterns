package ua.epam.myroniuk.behavioral.observer;

import java.util.List;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> magazines) {
        System.out.println(String.format("Dear %s! We have some changes in magazines list: \n %s", name, magazines));
    }
}
