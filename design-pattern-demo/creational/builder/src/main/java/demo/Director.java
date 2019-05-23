package demo;

public class Director {
    private ProductBuilder productBuilder;

    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product construct() {
        productBuilder.buildPartA();
        productBuilder.buildPartB();
        return productBuilder.getProduct();
    }
}
