package com.studing.decorate;

/**
 * Created by fengqz on 2017-3-16.
 */
public class Decorator4 extends CondimentDecorator {
    Beverage beverage;

    public Decorator4(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decorator4";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }
}
