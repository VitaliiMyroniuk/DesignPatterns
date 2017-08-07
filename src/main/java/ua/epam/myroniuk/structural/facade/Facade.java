package ua.epam.myroniuk.structural.facade;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Facade {
    private Figure circle;
    private Figure square;

    public Facade() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
