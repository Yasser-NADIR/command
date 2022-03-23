package client;

import invoker.Bouton;

public class Telecommande {
    private Bouton bouton1;
    private Bouton bouton2;
    private Bouton bouton3;
    private Bouton bouton4;

    public Telecommande(Bouton bouton1, Bouton bouton2, Bouton bouton3, Bouton bouton4) {
        this.bouton1 = bouton1;
        this.bouton2 = bouton2;
        this.bouton3 = bouton3;
        this.bouton4 = bouton4;
    }

    public void presseBouton1(){
        bouton1.invoke();
    }

    public void presseBouton2(){
        bouton2.invoke();
    }

    public void presseBouton3(){
        bouton3.invoke();
    }

    public void presseBouton4(){
        bouton4.invoke();
    }
}