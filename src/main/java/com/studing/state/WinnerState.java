package com.studing.state;

/**
 * Created by fengqz on 2017-3-29.
 */
public class WinnerState implements State {
    GumballMachine2 gumballMachine2;

    public WinnerState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    public void dispense() {
        System.out.println("You are winner! You got two gumballs for your quarter");
        gumballMachine2.releaseBall();
        if (gumballMachine2.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine2.setState(gumballMachine2.getSoldOutState());
        } else {
            gumballMachine2.releaseBall();
            if (gumballMachine2.getCount() == 0) {
                System.out.println("Oops, out of gumballs!");
                gumballMachine2.setState(gumballMachine2.getSoldOutState());
            } else {
                gumballMachine2.setState(gumballMachine2.getNoQuarterState());
            }
        }
    }
}
