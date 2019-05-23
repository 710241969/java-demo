package demo;

public class SmallProductBuilder extends ProductBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("Small partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Small partA");
    }
}
