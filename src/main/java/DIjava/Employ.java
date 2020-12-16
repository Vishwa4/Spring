package DIjava;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employ {
    private int i;

    public Employ(int i) {
        this.i=i;
    }
    public void display(){
        System.out.println("in employ");
    }
    public int getI() {
        return i;
    }
//    public void setI(int i) {
//        this.i = i;
//    }
}
