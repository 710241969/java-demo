package demo;

public class BigProductBuilder extends ProductBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("Big partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Big partA");
    }
}
