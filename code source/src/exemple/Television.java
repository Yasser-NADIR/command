package exemple;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("Tv is on");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("Tv is off");
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        if (volume < 100)
            volume++;
        System.out.println("Tv volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        if (volume > 0)
            volume--;
        System.out.println("Tv volume is at " + volume);
    }

}
