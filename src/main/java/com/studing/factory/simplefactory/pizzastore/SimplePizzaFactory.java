package com.studing.factory.simplefactory.pizzastore;

import com.studing.factory.simplefactory.pizza.CheesePizza;
import com.studing.factory.simplefactory.pizza.ClamPizza;
import com.studing.factory.simplefactory.pizza.Pizza;
import com.studing.factory.simplefactory.pizza.VeggiePizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        }else if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
