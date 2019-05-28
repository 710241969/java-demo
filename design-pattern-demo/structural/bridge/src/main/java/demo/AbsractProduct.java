package demo;

public abstract class AbsractProduct {
    protected InterfaceColor color;

    public AbsractProduct(InterfaceColor color) {
        this.color = color;
    }

    abstract public void operation();
}
