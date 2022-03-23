package command;

import business.Radio;

public class CommandRadioOn implements Command{
    private Radio radio;

    public CommandRadioOn(Radio radio){
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public void undo() {
        radio.off();
    }


}
