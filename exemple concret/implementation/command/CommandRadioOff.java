package command;

import business.Radio;

public class CommandRadioOff implements Command{
    private Radio radio;

    public CommandRadioOff(Radio radio){
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.off();
    }

    @Override
    public void undo() {
        radio.on();
    }


}
