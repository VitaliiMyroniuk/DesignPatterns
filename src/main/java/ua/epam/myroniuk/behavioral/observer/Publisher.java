package ua.epam.myroniuk.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Publisher implements Subject {
    List<String> magazines = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addMagazine(String magazine){
        this.magazines.add(magazine);
        notifyObservers();
    }

    public void removeMagazine(String magazine){
        this.magazines.remove(magazine);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.handleEvent(magazines);
        }
    }
}
