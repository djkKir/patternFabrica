import pizza.Pizza;
import pizza.PizzaStore;
import pizza.nyPizza.NYPizzaStore;

/**
 * Created by k.dodonov on 07.09.2017.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan orderd a " + pizza.getName() + "\n");

    }
}
