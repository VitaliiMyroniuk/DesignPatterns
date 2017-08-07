package ua.epam.myroniuk.creational.builder.classical_version;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Builder2 implements Builder {
    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void buildPart1() {
        product.setPart1(2);
    }

    @Override
    public void buildPart2() {
        product.setPart2("Product was created by Builder2");
    }
}
