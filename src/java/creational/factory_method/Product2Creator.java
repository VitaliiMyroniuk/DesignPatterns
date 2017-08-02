package creational.factory_method;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product2Creator extends AbstractCreator {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("Product#2 is created.");
        return new Product2();
    }
}
