package Singleton.EagerSingleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
    public void doSomething(){
        System.out.println("do something");
    }
}
