package ua.epam.myroniuk.creational.abstract_factory;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product2 implements AbstractProduct {
    private String creationPlace;

    public Product2(String creationPlace) {
        this.creationPlace = creationPlace;
    }

    @Override
    public void getInfo() {
        System.out.println("AbstractProduct#2 has been made at the " + creationPlace);
    }
}
