package demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        Prototype shallowPrototype = prototype.clone();
        System.out.println(prototype == shallowPrototype);
        Prototype deepPrototype = prototype.deepClone();
        System.out.println(prototype == deepPrototype);
    }
}
