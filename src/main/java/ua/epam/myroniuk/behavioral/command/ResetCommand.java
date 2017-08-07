package ua.epam.myroniuk.behavioral.command;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class ResetCommand implements Command {
    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
