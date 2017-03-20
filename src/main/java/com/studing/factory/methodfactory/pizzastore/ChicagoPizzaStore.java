package com.studing.factory.methodfactory.pizzastore;

import com.studing.factory.methodfactory.ingredient.ChicagoPizzaIngredientFactory;
import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;
import com.studing.factory.methodfactory.pizza.*;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
        }else if (type.equals("Clam")) {
            pizza = new ChicagoClamPizza(ingredientFactory);
        }else if (type.equals("Veggie")) {
            pizza = new ChicagoVeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
