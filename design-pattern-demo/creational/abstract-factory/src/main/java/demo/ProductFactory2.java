package demo;

public class ProductFactory2 implements InterfaceFactory {
    public InterfaceAProduct getAProduct() {
        return new AProduct2(2);
    }

    public InterfaceBProduct getBProduct() {
        return new BProduct2(2);
    }
}
