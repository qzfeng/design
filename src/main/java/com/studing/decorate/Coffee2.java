package com.studing.decorate;

/**
 * Created by fengqz on 2017-3-16.
 */
public class Coffee2 extends Beverage {
    public Coffee2() {
        description = "Coffee2";
    }

    @Override
    public double cost() {
        return 2.88;
    }
}
