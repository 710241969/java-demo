package demo;

public class ConcreteStrategyA implements InterfaceStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("执行具体策略 A");
    }
}
