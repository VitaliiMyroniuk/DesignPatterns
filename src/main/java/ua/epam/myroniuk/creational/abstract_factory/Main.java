package ua.epam.myroniuk.creational.abstract_factory;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryA(); // or new FactoryB();

        // this part does not depend of the factory kind
        AbstractProduct product1 = factory.createProduct1();
        product1.getInfo();
        AbstractProduct product2 = factory.createProduct2();
        product2.getInfo();
    }
}
