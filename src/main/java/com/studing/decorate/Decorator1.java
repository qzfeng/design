package com.studing.decorate;

/**
 * Created by fengqz on 2017-3-16.
 */
public class Decorator1 extends CondimentDecorator {
    Beverage beverage;

    public Decorator1(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decorator1";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
