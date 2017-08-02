package creational.builder;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Builder1());  // or new Builder2()
        Product product = director.constructProduct();
        System.out.println(product);
    }
}
