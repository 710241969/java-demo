package demo.ordinarysimlefactory;

import demo.AProduct;
import demo.BProduct;
import demo.InterfaceProduct;

public class ProductFactory {
    public InterfaceProduct getProduct(String productType) {
        InterfaceProduct product = null;
        if ("A".equals(productType)) {
            product = new AProduct();
        } else if ("B".equals(productType)) {
            product = new BProduct();
        }
        return product;
    }
}
