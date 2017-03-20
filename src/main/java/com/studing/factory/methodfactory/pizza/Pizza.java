package com.studing.factory.methodfactory.pizza;

import com.studing.factory.methodfactory.ingredient.Dough;
import com.studing.factory.methodfactory.ingredient.Sauce;

import java.util.ArrayList;

/**
 * Created by fengqz on 2017-3-16.
 */
public abstract class Pizza {
    String name;
    Dough dough; // 面团
    Sauce sauce; // 酱
    ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
