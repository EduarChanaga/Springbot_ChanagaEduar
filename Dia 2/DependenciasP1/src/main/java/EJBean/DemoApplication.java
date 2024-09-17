package EJBean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

        SerVivo persona = contexto.getBean(Persona.class);
        SerVivo serpiente = contexto.getBean(Serpiente.class);

        System.out.println(persona.caminar());
        System.out.println(serpiente.caminar());
    }
}
