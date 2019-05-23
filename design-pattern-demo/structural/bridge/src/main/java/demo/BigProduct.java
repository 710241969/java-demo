package demo;

public class BigProduct extends AbsractProduct {
    public BigProduct(InterfaceColor color) {
        super(color);
    }

    @Override
    public void operation() {
        System.out.println(color.doPaint() + " Big Product!");
    }
}
