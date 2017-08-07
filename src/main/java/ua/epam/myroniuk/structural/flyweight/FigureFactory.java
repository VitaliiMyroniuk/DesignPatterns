package ua.epam.myroniuk.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class FigureFactory {
    private static final Map<String, Figure> figures = new HashMap<>();

    public Figure getFigure(String name) {
        Figure figure = figures.get(name);
        if (figure == null) {
            switch (name) {
                case "circle":
                    figure = new Circle();
                    break;
                case "square":
                    figure = new Square();
                    break;
                case "point":
                    figure = new Point();
                    break;
            }
            figures.put(name, figure);
        }
        return figure;
    }
}
