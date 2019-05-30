package demo;

/**
 * @author wangyiming
 */
public class Context {
    private InterfaceStrategy strategy;

    public Context() {

    }

    public Context(InterfaceStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        System.out.println("环境选择哪一种策略呢");
        strategy.strategyMethod();
    }

    public InterfaceStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(InterfaceStrategy strategy) {
        this.strategy = strategy;
    }
}
