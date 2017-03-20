package com.studing.factory.methodfactory.ingredient;

/**
 * Created by fengqz on 2017-3-17.
 */
public interface PizzaIngredientFactory {
    Cheese createCheese();

    Clam createClam();

    Dough createDough();

    Sauce createSauce();

    Veggie createVeggie();
}
