package demo;

/**
 * 具体装饰角色
 *
 * @author wangyiming
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA() {
    }

    public ConcreteDecoratorA(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.decorateMethod();
    }

    public void decorateMethod() {
        System.out.println("ConcreteDecoratorA 为 " + getComponent().getClass().getName() + " 添加装饰 A");
    }
}
