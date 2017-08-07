package ua.epam.myroniuk.behavioral.state;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
