import business.Console;
import business.Radio;
import client.Telecommande;
import command.CommandConsoleOff;
import command.CommandConsoleOn;
import command.CommandConsoleStartGame;
import command.CommandConsoleStopGame;
import command.CommandRadioOff;
import command.CommandRadioOn;
import command.CommandRadioVolumeDown;
import command.CommandRadioVolumeUp;
import invoker.Bouton;

public class Program {
    public static void main(String[] args) {
        Telecommande consoleTelecommand = new Telecommande(
            new Bouton(new CommandConsoleOn(new Console())), 
            new Bouton(new CommandConsoleOff(new Console())), 
            new Bouton(new CommandConsoleStartGame(new Console())), 
            new Bouton(new CommandConsoleStopGame(new Console()))
        );

        Telecommande radioTelecommand = new Telecommande(
            new Bouton(new CommandRadioOn(new Radio())),
            new Bouton(new CommandRadioOff(new Radio())),
            new Bouton(new CommandRadioVolumeUp(new Radio())),
            new Bouton(new CommandRadioVolumeDown(new Radio()))
        );

        consoleTelecommand.presseBouton1();
        consoleTelecommand.presseBouton2();
        radioTelecommand.presseBouton3();
    }
}
