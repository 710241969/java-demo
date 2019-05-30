package demo;

/**
 * 具体装饰角色
 *
 * @author wangyiming
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB() {
    }

    public ConcreteDecoratorB(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.decorateMethod();
    }

    public void decorateMethod() {
        System.out.println("ConcreteDecoratorB 为 " + getComponent().getClass().getName() + " 添加装饰 B");
    }
}
