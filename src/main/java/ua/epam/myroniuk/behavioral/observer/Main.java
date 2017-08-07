package ua.epam.myroniuk.behavioral.observer;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        // initialization
        Publisher publisher = new Publisher();
        publisher.addMagazine("Sport");
        publisher.addMagazine("Business");
        Observer first = new Subscriber("Subscriber1");
        Observer second = new Subscriber("Subscriber2");
        publisher.addObserver(first);
        publisher.addObserver(second);

        // now publishers will be notified about new changes
        publisher.addMagazine("Fashion");
        publisher.removeObserver(first);
        System.out.println("\n===========================================================\n");
        publisher.removeMagazine("Sport");
    }
}
