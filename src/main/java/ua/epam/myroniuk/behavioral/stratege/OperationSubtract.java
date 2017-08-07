package ua.epam.myroniuk.behavioral.stratege;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int number1, int nummber2) {
        return number1 - nummber2;
    }
}
