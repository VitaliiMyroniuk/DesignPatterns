package ua.epam.myroniuk.structural.decorator;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Square implements Figure {
    @Override
    public void draw() {
        System.out.println("Figure: Square");
    }
}
