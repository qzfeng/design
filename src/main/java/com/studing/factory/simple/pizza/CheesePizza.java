package com.studing.factory.simple.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into four slices");
    }
}
