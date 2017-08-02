package ua.epam.myroniuk.creational.builder;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class Product {
    private int part1;
    private String part2;

    public void setPart1(int part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return String.format("part1: %d \npart2: %s", part1, part2);
    }
}
