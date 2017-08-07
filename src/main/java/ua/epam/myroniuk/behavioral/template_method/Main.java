package ua.epam.myroniuk.behavioral.template_method;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
