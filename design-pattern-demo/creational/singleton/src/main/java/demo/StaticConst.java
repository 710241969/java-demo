package java.demo;


public class StaticConst {
    private static final StaticConst INSTANCE = new StaticConst();

    private StaticConst() {
    }

    public StaticConst getInstance() {
        return INSTANCE;
    }
}
