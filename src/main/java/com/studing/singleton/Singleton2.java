package com.studing.singleton;

/**
 * 懒加载也叫延迟加载，第一次用到时创建实例，多线程不安全，不推荐
 * Created by fengqz on 2017-3-20.
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
