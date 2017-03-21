package com.studing.command;

import com.studing.command.component.Door;

/**
 * Created by fengqz on 2017-3-20.
 */
public class DoorCloseCommand implements Command {
    private Door door;
    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.close();
    }

    public void undo() {
        door.open();
    }
}
