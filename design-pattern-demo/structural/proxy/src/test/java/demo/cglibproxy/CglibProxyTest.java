package demo.cglibproxy;


import org.junit.jupiter.api.Test;

public class CglibProxyTest {
    @Test
    public void test() {
        TargetObject targetObject = new TargetObject();
        TargetObject proxyObject = (TargetObject) ProxyFactory.getProxyInstance(targetObject);
        proxyObject.doSomething1();
        proxyObject.doSomething2();
    }

    @Test
    public void test2() {
        TargetObject targetObject = new TargetObject();
        TargetObject proxyObject = (TargetObject) ProxyHandler.getProxyInstance(targetObject);
        proxyObject.doSomething1();
        proxyObject.doSomething2();
    }
}
