package ua.epam.myroniuk.behavioral.visitor;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
