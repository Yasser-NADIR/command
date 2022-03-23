package business;

public class Radio {
    private int volume = 0;

    public void on(){
        System.out.println("la radio est allumée");
    }

    public void off(){
        System.out.println("la radio est éteinte");
    }

    public void volumeUp(){
        volume++;
        System.out.println("le volume est de : " + volume);
    }

    public void volumeDown(){
        volume--;
        System.out.println("le volume est de : " + volume);
    }
}
