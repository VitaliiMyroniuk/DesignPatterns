package ua.epam.myroniuk.structural.facade;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Facade facadeMaker = new Facade();
        facadeMaker.drawCircle();
        facadeMaker.drawSquare();
    }
}
