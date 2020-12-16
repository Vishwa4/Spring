package DIjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Source {
    @Bean
    @Scope(value = "singleton")
    public Employ e(){
        return new Employ(5);
    }
}
