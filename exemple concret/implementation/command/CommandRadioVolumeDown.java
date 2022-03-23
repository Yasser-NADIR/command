package command;

import business.Radio;

public class CommandRadioVolumeDown implements Command{
    private Radio radio;

    public CommandRadioVolumeDown(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeDown();
    }

    @Override
    public void undo() {
        radio.volumeUp();
    }


}
