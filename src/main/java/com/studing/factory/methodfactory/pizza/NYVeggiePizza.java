package com.studing.factory.methodfactory.pizza;

import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-16.
 */
public class NYVeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public NYVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.addAll(Arrays.asList(ingredientFactory.createVeggie(), ingredientFactory.createCheese()));

    }
}
