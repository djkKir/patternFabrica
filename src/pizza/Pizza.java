package pizza;

import cheese.Cheese;
import clams.Clams;
import dough.Dough;
import pepperoni.Pepperoni;
import sauce.Sauce;
import veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.toString();
    }

    @Override
    public String toString() {
        return  name + '\n' +
                dough + '\n' +
                sauce + '\n' +
                Arrays.toString(veggies) +'\n' +
                cheese + '\n' +
                pepperoni + '\n' +
                clam;
    }
}
