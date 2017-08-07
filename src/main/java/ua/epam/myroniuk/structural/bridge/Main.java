package ua.epam.myroniuk.structural.bridge;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Triangle(new Red());
        Figure figure2 = new Square(new Blue());

        figure1.draw();
        figure2.draw();
    }
}
