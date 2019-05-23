package demo;

public class SmallProduct extends AbsractProduct {
    public SmallProduct(InterfaceColor color) {
        super(color);
    }

    @Override
    public void operation() {
        System.out.println(color.doPaint() + " Small Product!");
    }
}
