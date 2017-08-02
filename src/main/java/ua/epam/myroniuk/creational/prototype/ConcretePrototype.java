package ua.epam.myroniuk.creational.prototype;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class ConcretePrototype implements Prototype {
    // some fields

    // constructor
    public ConcretePrototype() {
    }

    @Override
    public Prototype copy() {
        // implementation of the clone creation
        return new ConcretePrototype();
    }
}
