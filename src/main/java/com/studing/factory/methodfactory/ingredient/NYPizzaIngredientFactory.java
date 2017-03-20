package com.studing.factory.methodfactory.ingredient;

/**
 * Created by fengqz on 2017-3-17.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Cheese createCheese() {
        return new Cheese();
    }

    public Clam createClam() {
        return new Clam();
    }

    public Dough createDough() {
        return new Dough();
    }

    public Sauce createSauce() {
        return new Sauce();
    }

    public Veggie createVeggie() {
        return new Veggie();
    }
}
