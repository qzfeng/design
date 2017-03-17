package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Veggie Cheese");
    }

    @Override
    public void prepare() {

    }
}
