package demo;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    /**
     * 半透明装饰
     * 一次装饰
     */
    @Test
    public void test1() {
        // 使用抽象构件类型定义
        AbstractComponent component = new ConcreteComponent();

        // 使用抽象装饰类型定义
        Decorator decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(component);
        decoratorA.operation();

        // 使用具体装饰类型定义
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(component);
        decoratorB.operation();
    }

    /**
     * 半透明装饰
     * 多次装饰
     */
    @Test
    public void test2() {
        // 使用抽象构件类型定义
        AbstractComponent component = new ConcreteComponent();

        // 使用具体装饰类型定义
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(component);

        // 使用具体装饰类型定义
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }

    /**
     * 透明装饰，即全部使用抽象构件定义
     * 一次装饰
     */
    @Test
    public void test3() {
        AbstractComponent component = new ConcreteComponent();

        AbstractComponent decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        AbstractComponent decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
    }
}
