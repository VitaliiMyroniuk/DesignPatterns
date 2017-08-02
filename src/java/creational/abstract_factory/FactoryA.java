package creational.abstract_factory;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class FactoryA implements AbstractFactory {
    @Override
    public AbstractProduct createProduct1() {
        return new Product1("FactoryA");
    }

    @Override
    public AbstractProduct createProduct2() {
        return new Product2("FactoryA");
    }
}
