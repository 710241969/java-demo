package demo;

public class ProductFactory1 implements InterfaceFactory {
    public InterfaceAProduct getAProduct() {
        return new AProduct1(1);
    }

    public InterfaceBProduct getBProduct() {
        return new BProduct1(1);
    }
}
