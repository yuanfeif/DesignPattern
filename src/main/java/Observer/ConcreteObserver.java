package Observer;

public class ConcreteObserver implements Observer{

    @Override
    public void update() {
        System.out.println("Received! Do something...");
    }
}
