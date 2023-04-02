package Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer o1 = new ConcreteObserver();
        Observer o2 = new ConcreteObserver();
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.doSomething();
    }
}
