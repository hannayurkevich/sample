import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class PersonTest {

    @Configuration
    static class TestConfig {

        @Bean
        public Person getPerson() {
            return new Person("Test User");
        }
    }

    @Autowired
    private Person person;

    @Test
    public void testGetGreeting() {
        assertEquals("Hello, my name is Test User", person.getGreeting());
    }
}
