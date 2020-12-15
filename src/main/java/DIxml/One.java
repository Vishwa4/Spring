package DIxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class One{
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Vehicle c= (Vehicle) context.getBean("Vehicle");
        c.drive();

    }
}