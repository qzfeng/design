package com.studing.factory.methodfactory.pizzastore;

import com.studing.factory.methodfactory.pizza.Pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
