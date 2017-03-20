package com.studing.factory.methodfactory.pizzastore;

import com.studing.factory.methodfactory.ingredient.NYPizzaIngredientFactory;
import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;
import com.studing.factory.methodfactory.pizza.*;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYPizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new NYCheesePizza(ingredientFactory);
        }else if (type.equals("Clam")) {
            pizza = new NYClamPizza(ingredientFactory);
        }else if (type.equals("Veggie")) {
            pizza = new NYVeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
