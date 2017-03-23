package com.studing.iterator;

import java.util.ArrayList;

/**
 * Created by fengqz on 2017-3-22.
 */
public class MenuTest {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu coffeeMenu = new CoffeeMenu();
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, coffeeMenu);
//        waitress.printMenu();

        ArrayList list = new ArrayList();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);
        list.add(coffeeMenu);
        Waitress waitress = new Waitress(list);
        waitress.printMenuIterator();
    }
}
