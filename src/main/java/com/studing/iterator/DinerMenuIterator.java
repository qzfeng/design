package com.studing.iterator;

import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-22.
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you have done at least next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
