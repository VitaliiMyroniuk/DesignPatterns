package ua.epam.myroniuk.structural.bridge;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Square extends Figure {
    public Square(Color color) {
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw %s square.", color.getName()));
    }
}
