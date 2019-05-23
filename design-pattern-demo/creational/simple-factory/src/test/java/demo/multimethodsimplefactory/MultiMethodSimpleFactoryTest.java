package demo.multimethodsimplefactory;

import demo.InterfaceProduct;
import org.junit.Test;

public class MultiMethodSimpleFactoryTest {

    @Test
    public void test() {
        ProductFactory productFactory = new ProductFactory();
        InterfaceProduct aProduct = productFactory.getAProduct();
        aProduct.doSomething();
        InterfaceProduct bProduct = productFactory.getBProduct();
        bProduct.doSomething();
    }


}
