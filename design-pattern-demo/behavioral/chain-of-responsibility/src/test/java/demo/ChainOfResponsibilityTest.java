package demo;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {
    @Test
    public void test() {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        handler1.setAbstractHandler(handler2);
        handler2.setAbstractHandler(handler3);
        handler1.handleRequest("1");
        handler1.handleRequest("2");
        handler1.handleRequest("3");
    }
}
