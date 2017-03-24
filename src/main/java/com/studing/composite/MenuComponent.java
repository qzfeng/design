package com.studing.composite;

import java.util.Iterator;

/**
 * 菜单组件
 * Created by fengqz on 2017-3-23.
 */
public abstract class MenuComponent {
    /**
     * 组合方法，给菜单组件使用
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 操作方法，给菜单项使用
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * 操作方法，同时被菜单和菜单项使用
     */
    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
}
