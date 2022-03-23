package command;

import business.Console;

public class CommandConsoleStopGame implements Command{
    private Console console;

    public CommandConsoleStopGame(Console console){
        this.console = console;
    }

    @Override
    public void execute() {
        console.stopGame();
    }

    @Override
    public void undo() {
        console.startGame();
    }
    
}
