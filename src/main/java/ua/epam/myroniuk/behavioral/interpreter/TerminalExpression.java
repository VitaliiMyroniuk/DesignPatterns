package ua.epam.myroniuk.behavioral.interpreter;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
