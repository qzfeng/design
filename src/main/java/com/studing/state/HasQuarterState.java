package com.studing.state;

import java.util.Random;

/**
 * Created by fengqz on 2017-3-27.
 */
public class HasQuarterState implements State {
    GumballMachine2 gumballMachine2;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2 = gumballMachine2;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine2.setState(gumballMachine2.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = random.nextInt(10);
        if (winner == 0 && gumballMachine2.getCount() > 1) {
            gumballMachine2.setState(gumballMachine2.getWinnerState());
        } else {
            gumballMachine2.setState(gumballMachine2.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
