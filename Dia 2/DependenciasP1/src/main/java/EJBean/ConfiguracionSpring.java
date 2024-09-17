package EJBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionSpring {

    @Bean
    public SerVivo persona() {
        return new Persona("rubio");
    }

    @Bean
    public SerVivo serpiente() {
        return new Serpiente();
    }
}
