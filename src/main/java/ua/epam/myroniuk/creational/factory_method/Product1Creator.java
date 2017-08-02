package ua.epam.myroniuk.creational.factory_method;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product1Creator extends AbstractCreator {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("Product#1 is created.");
        return new Product1();
    }
}
