package pizza.chicagoPizza;

import cheese.Cheese;
import cheese.MozzarellaCheese;
import clams.Clams;
import clams.FrozenClams;
import dough.Dough;
import dough.ThikCrustDough;
import pepperoni.Pepperoni;
import pepperoni.SlizcedPepperoni;
import pizza.PizzaIngredientFactory;
import sauce.PlumTomatSauce;
import sauce.Sauce;
import veggies.*;

/**
 * Created by k.dodonov on 12.09.2017.
 */
public class ChicagoIngredientfactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThikCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatSauce();
    }



    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives()
                , new EggPlant(),
                new Spinach()};
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlizcedPepperoni();
    }
}
