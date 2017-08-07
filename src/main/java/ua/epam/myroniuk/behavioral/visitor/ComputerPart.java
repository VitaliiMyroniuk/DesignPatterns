package ua.epam.myroniuk.behavioral.visitor;

/**
 * Created by Vitalii on 07.08.2017.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
