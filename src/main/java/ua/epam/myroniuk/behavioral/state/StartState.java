package ua.epam.myroniuk.behavioral.state;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
