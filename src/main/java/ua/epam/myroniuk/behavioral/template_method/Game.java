package ua.epam.myroniuk.behavioral.template_method;

/**
 * Created by Vitalii on 07.08.2017.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play(){
        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
