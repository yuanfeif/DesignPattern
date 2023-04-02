package Observer;

public class ConcreteSubject extends Subject{
    public void doSomething() {
        super.notifyAllObservers();
    }
}
