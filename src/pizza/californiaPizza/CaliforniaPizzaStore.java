package pizza.californiaPizza;

import pizza.*;

/**
 * Created by k.dodonov on 08.09.2017.
 */
public class CaliforniaPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new CaliforniaIngredientfactory();

        if (type.equals("cheese")){
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("California Style Cheese Pizza");

    }
        else if (type.equals("veggie")){
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("California Style Veggie Pizza");

    }
        else if (type.equals("clam")){
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("California Style Clam Pizza");

    }
        else if (type.equals("pepperoni")){
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("California Style Pepperoni Pizza");

    }
        return pizza;

}
}
