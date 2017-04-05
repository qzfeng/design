package com.studing.state;

/**
 * Created by fengqz on 2017-3-27.
 */
public class NoQuarterState implements State {
    GumballMachine2 gumballMachine2;

    public NoQuarterState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
    }

    public void insertQuarter() {
        gumballMachine2.setState(gumballMachine2.getHasQuarterState());
        System.out.println("You inserted a quarter");
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
