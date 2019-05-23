package demo;

public class AProduct2 implements InterfaceAProduct {
    private Integer group;

    public AProduct2(Integer group) {
        this.group = group;
    }

    public void doSomething() {
        System.out.println("This is A! Group " + group);
    }
}
