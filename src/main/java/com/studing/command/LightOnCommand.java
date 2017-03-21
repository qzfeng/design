package com.studing.command;

import com.studing.command.component.Light;

/**
 * Created by fengqz on 2017-3-20.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
