package demo;

import org.junit.jupiter.api.Test;

public class FlyweightTest {
    @Test
    public void test() {
        Flyweight a = FlyweightFactory.getFlyweight("a");
        Flyweight b = FlyweightFactory.getFlyweight("b");

        a.operation(new UnsharedConcreteFlyweight("1"));
        a.operation(new UnsharedConcreteFlyweight("2"));
        b.operation(new UnsharedConcreteFlyweight("3"));
        b.operation(new UnsharedConcreteFlyweight("4"));
    }

}
