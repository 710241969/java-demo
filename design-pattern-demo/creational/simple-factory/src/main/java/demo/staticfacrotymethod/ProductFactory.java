package demo.staticfacrotymethod;

import demo.AProduct;
import demo.BProduct;
import demo.InterfaceProduct;

public class ProductFactory {

    public static InterfaceProduct getProduct(String productType) {
        InterfaceProduct product = null;
        if ("A".equals(productType)) {
            product = new AProduct();
        } else if ("B".equals(productType)) {
            product = new BProduct();
        }
        return product;
    }

    public static InterfaceProduct getAProduct() {
        return new AProduct();
    }

    public static InterfaceProduct getBProduct() {
        return new BProduct();
    }
}
