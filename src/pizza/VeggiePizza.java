package pizza;

/**
 * Created by k.dodonov on 08.09.2017.
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;


    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
