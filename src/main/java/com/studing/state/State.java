package com.studing.state;

/**
 * Created by fengqz on 2017-3-27.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
