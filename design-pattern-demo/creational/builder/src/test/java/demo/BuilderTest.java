package demo;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test() {
        ProductBuilder bigProductBuilder = new BigProductBuilder();
        Director director = new Director(bigProductBuilder);
        Product product = director.construct();
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
    }
}
