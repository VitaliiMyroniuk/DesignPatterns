package ua.epam.myroniuk.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Composite implements Figure {
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void draw() {
        for(Figure figure : figures) {
            figure.draw();
        }
    }
}
