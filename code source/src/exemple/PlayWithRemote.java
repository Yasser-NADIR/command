package exemple;

public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice newDevice = TvRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(newDevice);

        DeviceButton onPresse = new DeviceButton(onCommand);

        onPresse.press();
    }
}
