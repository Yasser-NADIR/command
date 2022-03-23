package command;

import business.Console;

public class CommandConsoleStartGame implements Command{
    private Console console;

    public CommandConsoleStartGame(Console console){
        this.console = console;
    }

    @Override
    public void execute() {
        console.startGame();
    }

    @Override
    public void undo() {
        console.stopGame();
    }
    
}
