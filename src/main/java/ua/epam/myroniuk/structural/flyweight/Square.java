package ua.epam.myroniuk.structural.flyweight;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Square implements Figure {
    int side = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("(%d, %d): square with side = %d", x, y, side));
    }
}
