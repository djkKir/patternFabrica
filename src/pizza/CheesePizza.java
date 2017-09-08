package pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("includes ");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
