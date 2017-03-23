package com.studing.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by fengqz on 2017-3-23.
 */
public class CoffeeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CoffeeMenu() {
        addItem("白咖啡", "【京东超市】马来西亚进口 益昌老街2+1白咖啡1000g", false, 58.90);
        addItem("黑咖啡", "【京东超市】黑鹿咖啡 速溶咖啡三合一特浓咖啡 3in1 黑咖啡18g*30条", false, 39.80);
        addItem("速溶咖啡", "【京东超市】麦斯威尔奶香速溶咖啡30条（390克/盒）", true, 38.90);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }
}
