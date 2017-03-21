package com.studing.command.component;

/**
 * Created by fengqz on 2017-3-20.
 */
public class KitchenLight implements Light {
    public void on() {
        System.out.println("The kitchen light is on!");
    }

    public void off() {
        System.out.println("The kitchen light is off!");
    }
}
