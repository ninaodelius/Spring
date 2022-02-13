package se.nina;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Educator theEducator = context.getBean("myEducator", Educator.class);

        System.out.println(theEducator.getClassOfTheDay());

        context.close();
    }
}
