package andreamaiolo.demo.entities;

import java.util.List;

public class Menu {
    private List<Pizzas> allPizzas;
    private List<Toppings> allToppings;
    private List<Drinks> allDrinks;

    public Menu(List<Pizzas> allPizzas, List<Toppings> allToppings, List<Drinks> allDrinks) {
        this.allDrinks = allDrinks;
        this.allToppings = allToppings;
        this.allPizzas = allPizzas;
    }

    public List<Pizzas> getAllPizzas() {
        return allPizzas;
    }

    public void setAllPizzas(List<Pizzas> allPizzas) {
        this.allPizzas = allPizzas;
    }

    public List<Toppings> getAllToppings() {
        return allToppings;
    }

    public void setAllToppings(List<Toppings> allToppings) {
        this.allToppings = allToppings;
    }

    public List<Drinks> getAllDrinks() {
        return allDrinks;
    }

    public void setAllDrinks(List<Drinks> allDrinks) {
        this.allDrinks = allDrinks;
    }

    @Override
    public String toString() {
        return "Menu{\n" +
                "all our pizzas=\n" + allPizzas + "\n" +
                ", all our toppings=\n" + allToppings + "\n" +
                ", all our drinks=\n" + allDrinks + "\n" +
                '}';
    }
}
