package DIjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Source {
    @Bean
    public Employ e(){
        return new Employ();
    }
}
