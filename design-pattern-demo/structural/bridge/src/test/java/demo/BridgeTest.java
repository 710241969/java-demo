package demo;

import org.junit.Test;

public class BridgeTest {
    @Test
    public void test() {
        InterfaceColor color = new RedColor();
        AbsractProduct product = new BigProduct(color);
        product.operation();
    }
}
