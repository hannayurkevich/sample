import org.springframework.stereotype.Component;

@Component
public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return "Hello, my name is " + name;
    }

}
