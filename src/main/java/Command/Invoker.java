package Command;

public class Invoker{
    Command command = null;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}