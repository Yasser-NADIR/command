package exemple;

public class TvRemote {
    private static ElectronicDevice electronicDevice = null;

    public static ElectronicDevice getDevice() {
        if (electronicDevice == null)
            electronicDevice = new Television();
        return electronicDevice;
    }
}
