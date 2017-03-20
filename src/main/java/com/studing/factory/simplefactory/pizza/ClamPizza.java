package com.studing.factory.simplefactory.pizza;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.addAll(Arrays.asList("Clam","Cheese"));
    }
}
