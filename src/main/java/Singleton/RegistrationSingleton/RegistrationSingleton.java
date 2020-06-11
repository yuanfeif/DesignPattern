package Singleton.RegistrationSingleton;

public class RegistrationSingleton {
    private static class SingletonHolder{
        private static final RegistrationSingleton INSTANCE = new RegistrationSingleton();
    }
    private RegistrationSingleton(){}

    public static final RegistrationSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public void doSomething(){
        System.out.println("do something");
    }
}
