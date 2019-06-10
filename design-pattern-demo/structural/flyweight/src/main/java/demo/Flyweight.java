package demo;

public abstract class Flyweight {
    private String key;

    public Flyweight() {

    }

    public abstract void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);

    public Flyweight(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
