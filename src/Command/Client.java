package Command;

public class Client{
    static public void main(String[] args){
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}