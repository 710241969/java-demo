package demo.cglibproxy;


import org.junit.jupiter.api.Test;

public class CglibProxyTest {
    @Test
    public void test() {
        TargetObject targetObject = new TargetObject();
        TargetObject proxyObject = (TargetObject) new ProxyHandler(targetObject).getProxyInstance();
        proxyObject.doSomething();
    }
}
