package Proxy.StaticProxy;


public class StaticProxy implements Subject {
    private Subject subject;
    public StaticProxy (Subject subject){
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        //do some other things
        subject.doSomething();
    }
}
