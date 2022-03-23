package exemple;

public class TurnTvOn implements Command {

    private ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.on();
    }

}
