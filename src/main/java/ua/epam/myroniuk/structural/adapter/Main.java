package ua.epam.myroniuk.structural.adapter;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        DataBaseService dataBaseService = new Adapter();
        dataBaseService.insert();
        dataBaseService.update();
        dataBaseService.select();
        dataBaseService.delete();
    }
}
