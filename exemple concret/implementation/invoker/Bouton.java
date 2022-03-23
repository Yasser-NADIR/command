package invoker;

import command.Command;

public class Bouton {
    private Command command;

    public Bouton(Command command){
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }  
}
