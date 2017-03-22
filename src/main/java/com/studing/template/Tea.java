package com.studing.template;

/**
 * Created by fengqz on 2017-3-21.
 */
public class Tea extends Beverage {
    private boolean addCondiments;

    public Tea(boolean addCondiments) {
        this.addCondiments = addCondiments;
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon ...");
    }

    @Override
    public boolean customerWantsCondiments() {
        return addCondiments;
    }
}
