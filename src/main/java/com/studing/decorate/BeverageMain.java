package com.studing.decorate;

/**
 * 装饰者模式会生成大量的装饰类，可用工厂模式和生成器模式优化。
 * 组件和装饰者有共同的超类（抽象后的共同点）
 * Created by fengqz on 2017-3-16.
 */
public class BeverageMain {
    public static void main(String[] args) {
        Beverage beverage = new Coffee1();
        System.out.println(beverage.cost());
        beverage = new Decorator1(beverage);
        System.out.println(beverage.cost());
        beverage = new Decorator2(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        System.out.println("--------------------------------");
        Beverage beverage1 = new Decorator4(new Decorator3(new Decorator2(new Decorator1(new Coffee2()))));
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }
}
