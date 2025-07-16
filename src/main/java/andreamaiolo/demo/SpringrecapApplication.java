package andreamaiolo.demo;

import andreamaiolo.demo.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringrecapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringrecapApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringrecapApplication.class);

        Menu m = ctx.getBean(Menu.class);
        System.out.println(m);
        
    }

}
