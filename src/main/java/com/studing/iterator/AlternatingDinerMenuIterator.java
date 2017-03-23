package com.studing.iterator;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-23.
 */
public class AlternatingDinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar calendar = Calendar.getInstance();
        position = calendar.get(calendar.DAY_OF_WEEK) % 2;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 2;
        return menuItem;
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove");
    }
}
