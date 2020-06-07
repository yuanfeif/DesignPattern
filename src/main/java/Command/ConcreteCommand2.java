package Command;

public class ConcreteCommand2 extends Command{
    private Receiver receiver = null;

    public ConcreteCommand2(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        this.receiver.doSomething();
    }
}
