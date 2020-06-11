package Singleton.SafetyLazySingleton;

public class SafetyLazySingletonClient {
    public static void main(String[] args) {
        SafetyLazySingleton object = SafetyLazySingleton.getInstance();
        object.doSomething();
    }
}
