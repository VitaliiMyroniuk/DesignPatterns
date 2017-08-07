package ua.epam.myroniuk.structural.decorator;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class RedFigureDecorator extends FigureDecorator {
    public RedFigureDecorator(Figure decoratedFigure) {
        super(decoratedFigure);
    }

    @Override
    public void draw() {
        decoratedFigure.draw();
        setRedBorder(decoratedFigure);
    }

    private void setRedBorder(Figure decoratedFigure){
        System.out.println("Border Color: Red");
    }
}
