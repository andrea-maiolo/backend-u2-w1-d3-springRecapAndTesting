package andreamaiolo.demo;

import andreamaiolo.demo.entities.Menu;
import andreamaiolo.demo.entities.Order;
import andreamaiolo.demo.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource("application.properties")
@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;

    @Autowired
    @Qualifier("getTable1")
    private Table table;

    @Value("${coperto.value}")
    private double coperto;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("running");
        Order newOrder = new Order(this.table, 3, coperto);
        newOrder.addToOrder(menu.getAllPizzas().get(1));
        newOrder.addToOrder(menu.getAllDrinks().get(2));
        System.out.println(newOrder);
        Order no2 = new Order(this.table, 2, coperto);
        System.out.println(no2);

    }


}
