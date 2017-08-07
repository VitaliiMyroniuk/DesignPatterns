package ua.epam.myroniuk.behavioral.command;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class StopCommand implements Command {
    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
