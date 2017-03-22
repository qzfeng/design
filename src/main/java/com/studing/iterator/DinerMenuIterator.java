package com.studing.iterator;

import com.studing.factory.methodfactory.Menu;

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
}
