package com.studing.factory.methodfactory.pizza;

import com.studing.factory.methodfactory.ingredient.PizzaIngredientFactory;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-16.
 */
public class ChicagoVeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ChicagoVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Chicago Style Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.addAll(Arrays.asList(ingredientFactory.createVeggie(), ingredientFactory.createCheese()));
    }
}
