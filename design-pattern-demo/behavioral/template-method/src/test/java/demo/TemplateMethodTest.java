package demo;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    public void test() {
        AbstractClass clazz = new ConcreteClass();
        clazz.templateMethod();
    }
}
