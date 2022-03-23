package command;

import business.Console;

public class CommandConsoleOn implements Command{
    private Console console;

    public CommandConsoleOn(Console console){
        this.console = console;
    }

    @Override
    public void execute() {
        console.on();
    }

    @Override
    public void undo() {
        console.off();
    }
    
}
