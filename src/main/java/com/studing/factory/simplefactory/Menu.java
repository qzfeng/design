package com.studing.factory.simplefactory;

import com.studing.factory.simplefactory.pizzastore.PizzaStore;
import com.studing.factory.simplefactory.pizzastore.SimplePizzaFactory;

/**
 * Created by fengqz on 2017-3-17.
 */
public class Menu {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("Cheese");
        System.out.println("---------------------------");
        pizzaStore.orderPizza("Clam");
        System.out.println("---------------------------");
        pizzaStore.orderPizza("Veggie");
    }
}
