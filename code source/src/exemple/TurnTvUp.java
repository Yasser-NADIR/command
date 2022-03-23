package exemple;

public class TurnTvUp implements Command {

    private ElectronicDevice theDevice;

    public TurnTvUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.volumeUp();
    }

}
