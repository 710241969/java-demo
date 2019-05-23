package demo.multimethodsimplefactory;

import demo.AProduct;
import demo.BProduct;
import demo.InterfaceProduct;

/**
 * @author wangyiming
 */
public class ProductFactory {

    public InterfaceProduct getAProduct() {
        return new AProduct();
    }

    public InterfaceProduct getBProduct() {
        return new BProduct();
    }
}
