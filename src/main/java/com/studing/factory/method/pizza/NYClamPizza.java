package com.studing.factory.method.pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYClamPizza extends Pizza {
    public NYClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Clam Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ..." + dough);
        System.out.println("Adding sauce ..." + sauce);
        System.out.println("Adding topping:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }
}
