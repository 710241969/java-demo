package demo.ordinarysimlefactory;

import demo.InterfaceProduct;
import org.junit.jupiter.api.Test;

public class OrdinaySimpleFactoryTest {

    @Test
    public void test() {
        ProductFactory productFactory = new ProductFactory();
        InterfaceProduct aProduct = productFactory.getProduct("A");
        aProduct.doSomething();
        InterfaceProduct bProduct = productFactory.getProduct("B");
        bProduct.doSomething();
    }


}
