package demo.staticproxy;

import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void test() throws Exception {
        InterfaceObject object = new ProxyObject(new TargetObject());
        object.doSomething();
    }
}
