package command;

import business.Radio;

public class CommandRadioVolumeUp implements Command{
    private Radio radio;

    public CommandRadioVolumeUp(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeUp();
    }

    @Override
    public void undo() {
        radio.volumeDown();
    }


}
