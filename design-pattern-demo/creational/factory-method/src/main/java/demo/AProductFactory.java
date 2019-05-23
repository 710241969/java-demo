package demo;

public class AProductFactory implements InterfaceFactory {
    public InterfaceProduct getProduct() {
        return new AProduct();
    }
}
