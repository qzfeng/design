package com.studing.singleton;

/**
 * 双重空判断，代码块加同步锁，多线程安全，不影响性能，推荐
 * 不适用于JDK1.4及更早的版本
 * Created by fengqz on 2017-3-20.
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
