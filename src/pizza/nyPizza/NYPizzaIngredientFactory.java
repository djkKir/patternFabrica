package pizza.nyPizza;

import cheese.Cheese;
import cheese.ReggianoCheese;
import clams.Clams;
import clams.FreshClams;
import dough.Dough;
import dough.ThinCrustDough;
import pizza.PizzaIngredientFactory;
import sause.Marinarasause;
import sause.Sauce;
import veggies.*;

/**
 * Created by k.dodonov on 07.09.2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new Marinarasause();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garling(), new Onion(), new Mashroom(), new RedPepper()};
        return new Veggies[0];
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
