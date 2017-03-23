package com.studing.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-22.
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("鱼香肉丝", "猪肉、胡萝卜、辣椒、香菇", false, 19.99);
        addItem("西红柿鸡蛋", "西红柿、鸡蛋", true, 9.99);
        addItem("宫保鸡丁", "鸡肉、花生仁、土豆", false, 24.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
