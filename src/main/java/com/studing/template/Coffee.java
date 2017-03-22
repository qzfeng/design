package com.studing.template;

/**
 * Created by fengqz on 2017-3-21.
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter ...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk ...");
    }
}
