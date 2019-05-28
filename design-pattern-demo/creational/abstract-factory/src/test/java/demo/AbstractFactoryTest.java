package demo;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void test() {
        InterfaceFactory productFactory1 = new ProductFactory1();
        InterfaceAProduct aProduct1 = productFactory1.getAProduct();
        aProduct1.doSomething();
        InterfaceBProduct bProduct1 = productFactory1.getBProduct();
        bProduct1.doSomething();

        InterfaceFactory productFactory2 = new ProductFactory2();
        InterfaceAProduct aProduct2 = productFactory2.getAProduct();
        aProduct2.doSomething();
        InterfaceBProduct bProduct2 = productFactory2.getBProduct();
        bProduct2.doSomething();
    }
}
