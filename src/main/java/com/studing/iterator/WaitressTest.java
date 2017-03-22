package com.studing.iterator;

/**
 * Created by fengqz on 2017-3-22.
 */
public class WaitressTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
