package pizza.chicagoPizza;


import pizza.Pizza;
import pizza.PizzaStore;

/**
 * Created by k.dodonov on 08.09.2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }
        else if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        else return null;

    }
}
