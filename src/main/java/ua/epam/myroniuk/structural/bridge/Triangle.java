package ua.epam.myroniuk.structural.bridge;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Triangle extends Figure {
    public Triangle(Color color) {
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw %s triangle.", color.getName()));
    }
}
