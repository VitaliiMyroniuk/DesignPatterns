package ua.epam.myroniuk.structural.decorator;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class FigureDecorator implements Figure {
    protected Figure decoratedFigure;

    public FigureDecorator(Figure decoratedFigure){
        this.decoratedFigure = decoratedFigure;
    }

    public void draw(){
        decoratedFigure.draw();
    }
}
