package ua.epam.myroniuk.creational.builder.classical_version;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Builder1 implements Builder {
    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void buildPart1() {
        product.setPart1(1);
    }

    @Override
    public void buildPart2() {
        product.setPart2("Product was created by Builder1");
    }
}
