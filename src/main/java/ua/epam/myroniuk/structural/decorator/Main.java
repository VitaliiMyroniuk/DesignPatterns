package ua.epam.myroniuk.structural.decorator;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle();

        Figure redCircle = new RedFigureDecorator(new Circle());

        Figure redRectangle = new RedFigureDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
