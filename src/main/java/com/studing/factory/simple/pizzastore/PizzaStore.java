package com.studing.factory.simple.pizzastore;

import com.studing.factory.method.pizza.Pizza;
import com.studing.factory.simple.SimplePizzaFactory;

/**
 * Created by fengqz on 2017-3-16.
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
