package com.studing.command;

/**
 * Created by fengqz on 2017-3-20.
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("This slot has no component!");
    }

    public void undo() {
        System.out.println("There is nothing to undo!");
    }
}
