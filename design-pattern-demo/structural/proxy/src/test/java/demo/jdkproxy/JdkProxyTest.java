package demo.jdkproxy;


import org.junit.jupiter.api.Test;

public class JdkProxyTest {
    @Test
    public void test() {
        InterfaceObject realObject = new TargetObject();
        InterfaceObject proxyObject = (InterfaceObject) ProxyFactory.getProxyInstance(realObject);
        proxyObject.doSomething1();
        proxyObject.doSomething2();
    }

    @Test
    public void test2() {
        InterfaceObject realObject = new TargetObject();
        InterfaceObject proxyObject = (InterfaceObject) ProxyHandler.getProxyInstance(realObject);
        proxyObject.doSomething1();
        proxyObject.doSomething2();
    }
}
