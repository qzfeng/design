package com.studing.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 菜单
 * Created by fengqz on 2017-3-23.
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        System.out.println("----------------------------------");
        Iterator menu = menuComponents.iterator();
        while (menu.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) menu.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return null;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
