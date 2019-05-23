package demo;

public class Facade {

    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void doSomething() {
        systemA.doSomething();
        systemB.doSomething();
        systemC.doSomething();
    }
}
