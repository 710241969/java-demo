package demo;

public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String key) {
        super(key);
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.print("具体享元" + getKey() + "被调用，");
        System.out.println("非享元信息是:" + unsharedConcreteFlyweight.getInfo());
    }

}
