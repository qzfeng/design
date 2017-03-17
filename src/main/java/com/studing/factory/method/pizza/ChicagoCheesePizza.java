package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");
    }

    @Override
    public void prepare() {

    }
}
