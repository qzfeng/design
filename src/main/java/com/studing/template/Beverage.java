package com.studing.template;

/**
 * Created by fengqz on 2017-3-21.
 */
public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water ...");
    }

    /*
    子类必须实现的方法用抽象
     */
    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup ...");
    }

    /*
    子类必须实现的方法用抽象
     */
    abstract void addCondiments();

    /*
     钩子方法，子类可以覆盖。
     子类可以实现，也可以不实现的方法，用钩子。
     钩子方法让子类有机会在模板允许的范围内修改模板。
     */
    public boolean customerWantsCondiments() {
        return true;
    }
}
