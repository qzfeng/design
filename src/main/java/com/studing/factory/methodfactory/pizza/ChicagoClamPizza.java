package com.studing.factory.methodfactory.pizza;

import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ChicagoClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Chicago Style Clam Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.addAll(Arrays.asList(ingredientFactory.createClam(), ingredientFactory.createCheese()));
    }
}
