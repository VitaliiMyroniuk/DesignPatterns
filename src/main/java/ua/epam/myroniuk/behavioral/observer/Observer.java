package ua.epam.myroniuk.behavioral.observer;

import java.util.List;

/**
 * Created by Vitalii on 07.08.2017.
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
