package DIjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext c= new AnnotationConfigApplicationContext(Source.class);
        Employ y=c.getBean(Employ.class);
//        Employ x=c.getBean(Employ.class);
//        y.setI(5);
//        x.setI(10);
//        System.out.println(x.getI());
        System.out.println(y.getI());
    }
}
