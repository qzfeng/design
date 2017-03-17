package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Veggie Cheese");
    }

    @Override
    public void prepare() {

    }
}
