package com.studing.factory.simple.pizza;

import java.util.ArrayList;

/**
 * Created by fengqz on 2017-3-16.
 */
public abstract class Pizza {
    String name; // 名称
    String dough; // 面团
    String sauce; // 酱
    ArrayList toppings = new ArrayList(); // 其他配料

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ..." + dough);
        System.out.println("Adding sauce ..." + sauce);
        System.out.println("Adding topping:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

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
