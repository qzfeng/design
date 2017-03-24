package com.studing.composite;

/**
 * Created by fengqz on 2017-3-23.
 */
public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }
}
