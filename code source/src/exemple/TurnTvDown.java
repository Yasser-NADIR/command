package exemple;

public class TurnTvDown implements Command {

    private ElectronicDevice theDevice;

    public TurnTvDown(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.volumeDown();
    }

}
