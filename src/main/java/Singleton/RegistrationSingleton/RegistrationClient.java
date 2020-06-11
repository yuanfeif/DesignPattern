package Singleton.RegistrationSingleton;

public class RegistrationClient {
    public static void main(String[] args) {
        RegistrationSingleton object = RegistrationSingleton.getInstance();
        object.doSomething();
    }
}
