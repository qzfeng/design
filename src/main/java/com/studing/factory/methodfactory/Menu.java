package com.studing.factory.methodfactory;

import com.studing.factory.methodfactory.pizzastore.ChicagoPizzaStore;
import com.studing.factory.methodfactory.pizzastore.NYPizzaStore;
import com.studing.factory.methodfactory.pizzastore.PizzaStore;

/**
 * Created by fengqz on 2017-3-17.
 */
public class Menu {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NYPizzaStore();
        PizzaStore pizzaStore2 = new ChicagoPizzaStore();

        pizzaStore1.orderPizza("Cheese");
        pizzaStore2.orderPizza("Clam");

    }
}
