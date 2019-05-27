package demo;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void test() throws Exception {
        AbstractComponent root = new Composite("root");
        AbstractComponent leaf1 = new Leaf("leaf1");
        AbstractComponent leaf2 = new Leaf("leaf2");
        AbstractComponent leaf3 = new Leaf("leaf3");
        root.add(leaf1);
        root.add(leaf2);
        root.add(leaf3);
        root.operation();
    }
}
