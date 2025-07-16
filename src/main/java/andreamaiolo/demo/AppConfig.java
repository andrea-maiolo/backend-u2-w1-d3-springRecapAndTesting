package andreamaiolo.demo;

import andreamaiolo.demo.entities.Drinks;
import andreamaiolo.demo.entities.Pizzas;
import andreamaiolo.demo.entities.Table;
import andreamaiolo.demo.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Drinks getCoke() {
        return new Drinks("coke", 3.5, 200);
    }

    @Bean
    public Drinks getWater() {
        return new Drinks("water", 2.5, 0);
    }

    @Bean
    public Drinks getFanta() {
        return new Drinks("fanta", 3.5, 150);
    }


    @Bean
    public Toppings getHam() {
        return new Toppings("ham", 1.00, 100);
    }

    @Bean
    public Toppings getSalame() {
        return new Toppings("salame", 1.50, 350);
    }

    @Bean
    public Toppings getMushrooms() {
        return new Toppings("mushrooms", 2.10, 150);
    }

    @Bean
    public Toppings getAnchovies() {
        return new Toppings("anchovies", 2.30, 300);
    }

    @Bean
    public Toppings getTomato() {
        return new Toppings("tomato", 0.00, 0);
    }

    @Bean
    public Toppings getMozzarella() {
        return new Toppings("mozzarella", 0.00, 0);
    }


    @Bean
    public Pizzas getMargherita() {
        Pizzas base = new Pizzas("margherita", 5.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        return base;
    }

    @Bean
    public Pizzas getHamMushrooms() {
        Pizzas base = new Pizzas("prosciutto e funghi", 5.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        base.addTopping(getHam());
        base.addTopping(getMushrooms());
        return base;
    }

    @Bean
    public Pizzas getSiciliana() {
        Pizzas base = new Pizzas("siciliana", 5.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        base.addTopping(getAnchovies());
        return base;
    }


    @Bean
    public Table getTable1() {
        return new Table(1, 4);
    }

    @Bean
    public Table getTable2() {
        return new Table(2, 4);
    }

    @Bean
    public Table getTable3() {
        return new Table(3, 6);
    }

    @Bean
    public Table getTable4() {
        return new Table(4, 2);
    }

    @Bean
    public Table getTable5() {
        return new Table(5, 8);
    }

}
