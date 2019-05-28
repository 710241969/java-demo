package demo;

public abstract class AbstractClass {
    public void templateMethod() {
        specificMethod();
        abstractMethod();
    }

    public void specificMethod() {
        System.out.println("抽象类 具体方法 调用");
    }

    abstract public void abstractMethod();
}
