package ua.epam.myroniuk.behavioral.visitor;

/**
 * Created by Vitalii on 07.08.2017.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
