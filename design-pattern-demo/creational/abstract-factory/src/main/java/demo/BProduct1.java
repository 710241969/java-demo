package demo;

public class BProduct1 implements InterfaceBProduct {
    private Integer group;

    public BProduct1(Integer group) {
        this.group = group;
    }

    public void doSomething() {
        System.out.println("This is B! Group " + group);
    }
}
