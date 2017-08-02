package ua.epam.myroniuk.creational.singleton;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    // constructor
    private LazyInitializedSingleton(){
    }

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
