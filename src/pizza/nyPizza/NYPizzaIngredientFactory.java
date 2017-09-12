package pizza.nyPizza;

import cheese.Cheese;
import cheese.ReggianoCheese;
import clams.Clams;
import clams.FreshClams;
import dough.Dough;
import dough.ThinCrustDough;
import pepperoni.Pepperoni;
import pepperoni.WahhhPepperoni;
import pizza.PizzaIngredientFactory;
import sauce.Marinarasause;
import sauce.Sauce;
import veggies.*;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Pepperoni createPepperoni() {
        return new WahhhPepperoni();
    }

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
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
