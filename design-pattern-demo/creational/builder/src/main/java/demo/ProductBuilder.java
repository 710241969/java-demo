package demo;

public abstract class ProductBuilder {
    protected Product product = new Product();

    abstract protected void buildPartA();

    abstract protected void buildPartB();

    public Product getProduct() {
        return product;
    }
}
