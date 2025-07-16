package andreamaiolo.demo;

import andreamaiolo.demo.entities.Drinks;
import andreamaiolo.demo.entities.Menu;
import andreamaiolo.demo.entities.Pizzas;
import andreamaiolo.demo.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringrecapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringrecapApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringrecapApplication.class);

        Toppings ham = ctx.getBean("getHam", Toppings.class);
        Drinks coca = ctx.getBean("getCoke", Drinks.class);
        Pizzas p = ctx.getBean("getHamMushrooms", Pizzas.class);
        System.out.println(ham);
        System.out.println(coca);
        System.out.println(p);

        Menu m = ctx.getBean("getMenu", Menu.class);
        System.out.println(m);
    }

}
