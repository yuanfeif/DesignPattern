package Singleton.DCLSingleton;

public class DCLSingletonClient {
    public static void main(String[] args) {
        DCLSingleton object = DCLSingleton.getInstance();
        object.doSomething();
    }
}
