package demo;

import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void test() {
        Context context = new Context();
        InterfaceStrategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.doSomething();
    }
}
