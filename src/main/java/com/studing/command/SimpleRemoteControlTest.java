package com.studing.command;

import com.studing.command.component.KitchenLight;
import com.studing.command.component.Light;

/**
 * Created by fengqz on 2017-3-20.
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new KitchenLight();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonPressed();
        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonPressed();

    }
}
