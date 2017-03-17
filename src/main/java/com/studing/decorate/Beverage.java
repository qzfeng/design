package com.studing.decorate;

/**
 * Created by fengqz on 2017-3-16.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
