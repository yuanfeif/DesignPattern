package Observer;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    public void delObserver(Observer o) {
        this.observers.remove(o);
    }

    public void notifyAllObservers() {
        for (Observer o : this.observers) {
            o.update();
        }
    }
}
