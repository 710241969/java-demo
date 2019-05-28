package demo.staticproxy;


import org.junit.jupiter.api.Test;

public class StaticProxyTest {
    @Test
    public void test() throws Exception {
        InterfaceObject object = new ProxyObject(new TargetObject());
        object.doSomething();
    }
}
