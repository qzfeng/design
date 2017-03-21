package com.studing.command;

import com.studing.command.component.Door;

/**
 * Created by fengqz on 2017-3-20.
 */
public class DoorOpenCommand implements Command {
    private Door door;
    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }

    public void undo() {
        door.close();
    }
}
