package demo;

import org.junit.jupiter.api.Test;


public class AdapterTest {
    @Test

    public void classAdapterTest() {
        InterfaceTarget target = new ClassAdapter();
        target.request();
    }

    @Test
    public void objectAdapterTest() {
        Adaptee adaptee = new Adaptee();
        InterfaceTarget target = new ObjectAdapter(adaptee);
        target.request();
    }
}
