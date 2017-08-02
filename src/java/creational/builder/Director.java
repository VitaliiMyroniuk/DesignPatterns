package creational.builder;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product constructProduct() {
        builder.buildPart1();
        builder.buildPart2();
        return builder.getProduct();
    }
}
