package ua.epam.myroniuk.behavioral.observer;

/**
 * Created by Vitalii on 07.08.2017.
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
