package exemple;

public class TurnTvOff implements Command {

    private ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.off();
    }

}
