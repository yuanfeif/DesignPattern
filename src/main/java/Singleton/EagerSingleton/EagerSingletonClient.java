package Singleton.EagerSingleton;

public class EagerSingletonClient {
    public static void main(String[] args) {
        EagerSingleton object = EagerSingleton.getInstance();
        object.doSomething();
    }
}
