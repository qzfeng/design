package com.studing.singleton;

/**
 * 类加载时创建实例，多线程安全
 * Created by fengqz on 2017-3-20.
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
