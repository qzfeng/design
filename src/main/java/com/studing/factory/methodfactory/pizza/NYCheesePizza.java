package com.studing.factory.methodfactory.pizza;

import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Cheese Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.addAll(Arrays.asList(ingredientFactory.createCheese()));
    }
}
