package com.studing.factory.singleton;

/**
 * 防止多线程时实例化多个实例，方法加同步锁，多线程安全，性能低，不推荐
 * Created by fengqz on 2017-3-20.
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}

