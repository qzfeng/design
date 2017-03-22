package com.studing.template;

/**
 * Created by fengqz on 2017-3-21.
 */
public class BeverageTest {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea(false);
        coffee.prepareRecipe();
        System.out.println("--------------------");
        tea.prepareRecipe();
    }
}
