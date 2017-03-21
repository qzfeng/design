package com.studing.command.component;

/**
 * Created by fengqz on 2017-3-20.
 */
public class LivingRoomDoor implements Door {
    public void open() {
        System.out.println("The living room door is open!");
    }

    public void close() {
        System.out.println("The living room door is close!");
    }
}
