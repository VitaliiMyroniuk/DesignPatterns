package ua.epam.myroniuk.structural.adapter;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Adapter extends UserService implements DataBaseService {
    @Override
    public void insert() {
        insertUser();
    }

    @Override
    public void update() {
        updateUser();
    }

    @Override
    public void select() {
        selectUser();
    }

    @Override
    public void delete() {
        deleteUser();
    }
}
