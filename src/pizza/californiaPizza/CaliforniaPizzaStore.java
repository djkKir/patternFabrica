package pizza.californiaPizza;

import pizza.Pizza;
import pizza.PizzaStore;

/**
 * Created by k.dodonov on 08.09.2017.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        }
        else if (type.equals("veggie")){
            return new CaliforniaStyleVeggiePizza();
        }
        else if (type.equals("clam")){
            return new CaliforniaStyleClamPizza();
        }
        else if (type.equals("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        }
        else return null;
    }
}
