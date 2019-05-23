package demo;

public abstract class AbsractProduct {
    protected InterfaceColor color;

    public AbsractProduct(InterfaceColor color) {
        this.color = color;
    }

    public abstract void operation();
}
