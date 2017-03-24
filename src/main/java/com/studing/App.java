package com.studing;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        App app = new App();
        //app.path();
        app.testArrayList();
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(Math.abs("192.168.10.29".hashCode()));
        System.out.println(Math.abs("192.168.10.30".hashCode()));
    }

    private void path() throws IOException {
        System.out.println(new File("").getCanonicalPath());
        System.out.println("--------------------------");
        System.out.println(new File("").getAbsolutePath());
    }

    private void testArrayList() {
        Integer[] list = {5, 4, 8, 2, 6, 10, 1};
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("--------------");
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 5) {
                remove(list,i);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private void remove(Integer[] list, int index) {
        if (list[index] != null) {
            for (int i = index; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
        }
    }
}
