package ua.epam.myroniuk.structural.flyweight;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Circle implements Figure {
    int radius = 1;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%d, %d): circle with radius = %d", x, y, radius));
    }
}
