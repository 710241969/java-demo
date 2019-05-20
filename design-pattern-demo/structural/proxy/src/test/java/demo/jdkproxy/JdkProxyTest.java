package demo.jdkproxy;

import org.junit.Test;

public class JdkProxyTest {
    @Test
    public void test() {
        InterfaceObject realObject = new TargetObject();
        InterfaceObject proxyObject = (InterfaceObject) new ProxyFactory(realObject).getProxyInstance();
        proxyObject.doSomething();
    }

    @Test
    public void test2() {
        InterfaceObject realObject = new TargetObject();
        InterfaceObject proxyObject = (InterfaceObject) new ProxyFactory(realObject).getProxyInstance();
        proxyObject.doSomething();
    }
}
