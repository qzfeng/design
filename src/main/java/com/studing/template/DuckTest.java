package com.studing.template;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-21.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("绿头鸭", 12, 15),
                new Duck("红头鸭", 11, 18),
                new Duck("白头鸭", 10, 12),
                new Duck("蓝头鸭", 10, 11)};
        System.out.println("Before sorting ...");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting ...");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
