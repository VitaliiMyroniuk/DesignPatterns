package ua.epam.myroniuk.creational.factory_method;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractCreator creator = new Product1Creator();  // or new Product2Creator()

        // this part does not depend of the creator kind
        AbstractProduct product = creator.createProduct();
        product.getInfo();
    }
}
