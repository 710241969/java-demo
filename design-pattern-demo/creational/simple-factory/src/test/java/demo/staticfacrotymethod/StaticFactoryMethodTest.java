package demo.staticfacrotymethod;

import demo.InterfaceProduct;
import org.junit.Test;

public class StaticFactoryMethodTest {
    @Test
    public void test() {
        InterfaceProduct aProduct1 = ProductFactory.getAProduct();
        aProduct1.doSomething();
        InterfaceProduct bProduct1 = ProductFactory.getBProduct();
        bProduct1.doSomething();
        InterfaceProduct aProduct2 = ProductFactory.getProduct("A");
        aProduct2.doSomething();
        InterfaceProduct bProduct2 = ProductFactory.getProduct("B");
        bProduct2.doSomething();
    }
}
