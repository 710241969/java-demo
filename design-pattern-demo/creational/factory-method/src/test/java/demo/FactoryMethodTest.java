package demo;


import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    @Test
    public void test() {
        InterfaceFactory aProductFactory = new AProductFactory();
        InterfaceProduct aProduct = aProductFactory.getProduct();
        aProduct.doSomething();
        InterfaceFactory bProductFactory = new BProductFactory();
        InterfaceProduct bProduct = bProductFactory.getProduct();
        bProduct.doSomething();
    }
}
