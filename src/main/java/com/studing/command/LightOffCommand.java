package com.studing.command;

import com.studing.command.component.Light;

/**
 * Created by fengqz on 2017-3-20.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
