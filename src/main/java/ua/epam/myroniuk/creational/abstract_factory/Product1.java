package ua.epam.myroniuk.creational.abstract_factory;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product1 implements AbstractProduct {
    private String creationPlace;

    public Product1(String creationPlace) {
        this.creationPlace = creationPlace;
    }

    @Override
    public void getInfo() {
        System.out.println("AbstractProduct#1 has been made at the " + creationPlace);
    }
}
