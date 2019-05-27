package demo;

public class Leaf extends AbstractComponent {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶 " + name + " ：被访问！");
    }
}
