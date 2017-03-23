package com.studing.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-22.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu coffeeMenu;
    ArrayList<Iterator> iterators;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu coffeeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.coffeeMenu = coffeeMenu;
    }

    public Waitress(ArrayList iterators) {
        this.iterators = iterators;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator coffeeMenuIterator = coffeeMenu.createIterator();
        printMenu(pancakeHouseMenuIterator);
        System.out.println("----------------------------");
        printMenu(dinerMenuIterator);
        System.out.println("----------------------------");
        printMenu(coffeeMenuIterator);
    }

    public void printMenuIterator() {
        Iterator<Iterator> iterator = iterators.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
