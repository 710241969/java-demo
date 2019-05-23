package demo;

public class AProduct1 implements InterfaceAProduct {
    private Integer group;

    public AProduct1(Integer group) {
        this.group = group;
    }

    public void doSomething() {
        System.out.println("This is A! Group " + group);
    }
}
