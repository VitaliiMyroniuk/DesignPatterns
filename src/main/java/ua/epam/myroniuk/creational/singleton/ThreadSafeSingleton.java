package ua.epam.myroniuk.creational.singleton;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    // constructor
    private ThreadSafeSingleton(){
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
