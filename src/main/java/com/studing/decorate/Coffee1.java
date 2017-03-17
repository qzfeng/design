package com.studing.decorate;

/**
 * Created by fengqz on 2017-3-16.
 */
public class Coffee1 extends Beverage {
    public Coffee1() {
        description = "Coffee1";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
