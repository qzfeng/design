package com.studing.factory.simple.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Veggie Cheese");
    }
}
