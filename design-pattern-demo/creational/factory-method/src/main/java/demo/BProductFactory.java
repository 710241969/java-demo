package demo;

public class BProductFactory implements InterfaceFactory {
    public InterfaceProduct getProduct() {
        return new BProduct();
    }
}
