package creational.factory_method;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product1 implements AbstractProduct {
    // fields, constructors

    @Override
    public void getInfo() {
        System.out.println("Info about Product#1 is displaying...");
    }
}
