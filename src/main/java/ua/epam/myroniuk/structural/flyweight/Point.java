package ua.epam.myroniuk.structural.flyweight;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Point implements Figure {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%d, %d): point", x, y));
    }
}
