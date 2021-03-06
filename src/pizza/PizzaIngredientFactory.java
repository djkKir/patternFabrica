package pizza;

import cheese.Cheese;
import clams.Clams;
import dough.Dough;
import sause.Sauce;
import veggies.Veggies;

/**
 * Created by k.dodonov on 07.09.2017.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Clams createClam();
}
