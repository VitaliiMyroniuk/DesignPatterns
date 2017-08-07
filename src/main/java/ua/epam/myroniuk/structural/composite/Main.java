package ua.epam.myroniuk.structural.composite;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Figure square = new Square();
        Figure circle = new Circle();
        Figure triangle = new Triangle();

        Composite composite = new Composite();

        composite.addFigure(square);
        composite.addFigure(circle);
        composite.addFigure(triangle);

        composite.draw();
    }
}
