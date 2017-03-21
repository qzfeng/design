package com.studing.command;

/**
 * Created by fengqz on 2017-3-20.
 */
public interface Command {
    void execute();

    void undo();
}
