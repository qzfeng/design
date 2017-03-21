package com.studing.command;

import java.util.Arrays;

/**
 * Created by fengqz on 2017-3-20.
 */
public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = noCommand;
        }
        for (int i = 0; i < offCommand.length; i++) {
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command commandOn, Command commandOff) {
        onCommand[slot] = commandOn;
        offCommand[slot] = commandOff;
    }

    public void onButtonPressed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonPressed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n----------- Remote Control ------------\n");
        for (int i = 0; i < onCommand.length; i++) {
            sb.append("[Slot" + i + "]" + onCommand[i].getClass().getName() + "  " + offCommand[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
