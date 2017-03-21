package com.studing.command.component;

/**
 * Created by fengqz on 2017-3-20.
 */
public class KitchenDoor implements Door {
    public void open() {
        System.out.println("The kitchen door is open!");
    }

    public void close() {
        System.out.println("The kitchen door is close!");
    }
}
