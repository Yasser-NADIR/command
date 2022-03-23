package command;

import business.Console;

public class CommandConsoleOff implements Command{
    private Console console;

    public CommandConsoleOff(Console console){
        this.console = console;
    }

    @Override
    public void execute() {
        console.off();
    }

    @Override
    public void undo() {
        console.on();
    }
}
