package Proxy.StaticProxy;

public class StaticProxyClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        StaticProxy proxy = new StaticProxy(subject);
        proxy.doSomething();
    }
}
