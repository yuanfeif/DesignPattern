package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new DynamicProxyHandler(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomething();
    }
}
