package andreamaiolo.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Pizzas extends Food {
    private List<Toppings> listToppings;

    public Pizzas(String name, double price, int calories) {
        super(name, price, calories);
        this.listToppings = new ArrayList<>();
    }

    public void addTopping(Toppings t) {
        this.listToppings.add(t);
        caloriesCount();
        priceCount();
    }

    public void priceCount() {
        double toppingsPrice = this.listToppings.stream()
                .mapToDouble(t -> t.getPrice())
                .sum();
        this.price = 5 + toppingsPrice;
    }

    public void caloriesCount() {
        int toppingsCal = this.listToppings.stream()
                .mapToInt(t -> t.getCalories())
                .sum();
        this.calories = 300 + toppingsCal;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "listToppings=" + listToppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
