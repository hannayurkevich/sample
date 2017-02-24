import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.getGreeting());
    }
}
