package demo;

public class BProduct2 implements InterfaceBProduct {
    private Integer group;

    public BProduct2(Integer group) {
        this.group = group;
    }

    public void doSomething() {
        System.out.println("This is B! Group " + group);
    }
}
