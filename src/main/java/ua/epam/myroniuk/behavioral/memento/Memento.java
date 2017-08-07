package ua.epam.myroniuk.behavioral.memento;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
