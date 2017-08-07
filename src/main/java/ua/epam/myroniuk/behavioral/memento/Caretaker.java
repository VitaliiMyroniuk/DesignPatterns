package ua.epam.myroniuk.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
