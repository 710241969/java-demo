package demo;

import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    public void test() {
        // 被观察对象
        AbstractSubject subject = new ConcreteSubject();
        // 观察者A
        InterfaceObserver observerA = new ConcreteObserverA();
        // 观察者B
        InterfaceObserver observerB = new ConcreteObserverB();

        subject.addObserver(observerA);
        subject.addObserver(observerB);

        subject.notifyObserver();
    }
}
