package Command;

public class ConcreteCommand1 extends Command{
    Receiver receiver = null;

    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        this.receiver.doSomething();
    }
}
