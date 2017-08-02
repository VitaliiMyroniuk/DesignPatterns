package ua.epam.myroniuk.creational.abstract_factory;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class FactoryB implements AbstractFactory {
    @Override
    public AbstractProduct createProduct1() {
        return new Product1("FactoryB");
    }

    @Override
    public AbstractProduct createProduct2() {
        return new Product2("FactoryB");
    }
}
