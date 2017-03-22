package com.studing.iterator;


import java.util.ArrayList;

/**
 * Created by fengqz on 2017-3-22.
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position;
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

}
