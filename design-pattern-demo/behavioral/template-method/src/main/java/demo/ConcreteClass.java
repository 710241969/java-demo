package demo;

public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("具体类 实现的抽象方法 调用");
    }
}
