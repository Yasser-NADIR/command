package implementation;

public class Program {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}
