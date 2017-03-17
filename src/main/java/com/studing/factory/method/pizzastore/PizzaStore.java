package com.studing.factory.method.pizzastore;

import com.studing.factory.method.pizza.Pizza;

/**
 * Created by fengqz on 2017-3-16.
 */
public abstract class PizzaStore {
//    SimplePizzaFactory simplePizzaFactory;
//    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
//        this.simplePizzaFactory = simplePizzaFactory;
//    }

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
