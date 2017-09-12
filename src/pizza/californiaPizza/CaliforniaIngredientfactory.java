package pizza.californiaPizza;

import cheese.Cheese;
import cheese.MozzarellaCheese;
import clams.BigCezarClam;
import clams.Clams;
import dough.Dough;
import dough.SquereDough;
import pepperoni.Pepperoni;
import pepperoni.SmallLenghtPepperoni;
import pizza.PizzaIngredientFactory;
import sauce.Sauce;
import sauce.TomatoHrenSauce;
import veggies.GreenOlives;
import veggies.Nuts;
import veggies.Onion;
import veggies.Veggies;

/**
 * Created by k.dodonov on 12.09.2017.
 */
public class CaliforniaIngredientfactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new SquereDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoHrenSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Nuts(), new Onion(), new GreenOlives() };
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new BigCezarClam();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SmallLenghtPepperoni();
    }
}
