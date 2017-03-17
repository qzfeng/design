package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");
    }

    @Override
    public void prepare() {

    }
}
