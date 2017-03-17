package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoClamPizza extends Pizza {

    public ChicagoClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Clam Cheese");
    }

    @Override
    public void prepare() {

    }
}
