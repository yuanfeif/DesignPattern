package Singleton.SafetyLazySingleton;

public class SafetyLazySingleton {
    private static SafetyLazySingleton instance;
    private SafetyLazySingleton(){}

    public static synchronized SafetyLazySingleton getInstance(){
        if(instance == null){
            instance = new SafetyLazySingleton();
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("do something");
    }
}
