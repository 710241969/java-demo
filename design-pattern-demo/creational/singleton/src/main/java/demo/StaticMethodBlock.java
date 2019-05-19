package java.demo;

public class StaticMethodBlock {
    private static final StaticMethodBlock INSTANCE;

    static {
        INSTANCE = new StaticMethodBlock();
    }

    private StaticMethodBlock() {
    }

    public StaticMethodBlock getInstance() {
        return INSTANCE;
    }
}
