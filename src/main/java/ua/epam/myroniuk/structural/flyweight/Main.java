package ua.epam.myroniuk.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        FigureFactory shapeFactory = new FigureFactory();
        List<Figure> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getFigure("point"));
        shapes.add(shapeFactory.getFigure("circle"));
        shapes.add(shapeFactory.getFigure("square"));

        Random random = new Random();
        for (Figure figure : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            figure.draw(x, y);
        }
    }
}
