package ua.epam.myroniuk.behavioral.command;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();           // Receiver
        Command start = new StartCommand(computer);   // Concrete command
        Command stop = new StopCommand(computer);     // Concrete command
        Command reset = new ResetCommand(computer);   // Concrete command
        User user = new User(start, stop, reset);     // Invoker

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
