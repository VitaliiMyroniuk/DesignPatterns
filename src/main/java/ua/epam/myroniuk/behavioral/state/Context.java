package ua.epam.myroniuk.behavioral.state;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
