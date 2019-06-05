package demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(value = {SpringExtension.class})
@ContextConfiguration(locations = {"/spring-config.xml"})
public class SpringTest {
    @Autowired
    private Person person;

    @Test
    public void test() {
        System.out.println(person.getName());
    }
}
