package com.studing.factory.simple.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Veggie Cheese");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes at 450");
    }
}
