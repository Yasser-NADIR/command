package business;

public class Console {
    private boolean on = false;

    public boolean isOn(){
        return on;
    }

    public void on(){
        on = true;
        System.out.println("la console est allumée");
    }

    public void off(){
        on = false;
        System.out.println("la console est éteinte");
    }

    public void startGame(){
        System.out.println("jeu lancé");
    }

    public void stopGame(){
        System.out.println("jeu arrêté");
    }
}
