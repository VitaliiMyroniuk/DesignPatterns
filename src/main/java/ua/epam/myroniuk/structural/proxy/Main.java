package ua.epam.myroniuk.structural.proxy;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
