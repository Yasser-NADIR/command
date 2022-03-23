package sameExample.interfaces;

import exemple.Command;

public class UserCommandDisplay {
    private Command command;

    public UserCommandDisplay(Command command) {
        this.command = command;
    }

    public void display() {
        command.execute();
        System.out.println();
    }

}
