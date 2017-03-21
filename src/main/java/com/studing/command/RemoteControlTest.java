package com.studing.command;

import com.studing.command.component.*;

/**
 * Created by fengqz on 2017-3-20.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new KitchenLight();
        Light livingRoomLight = new LivingRoomLight();
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);

        Door kitchenDoor = new KitchenDoor();
        Door livingRoomDoor = new LivingRoomDoor();
        DoorOpenCommand kitchenDoorOpenCommand = new DoorOpenCommand(kitchenDoor);
        DoorCloseCommand kitchenDoorCloseCommand = new DoorCloseCommand(kitchenDoor);
        DoorOpenCommand livingRoomDoorOpenCommand = new DoorOpenCommand(livingRoomDoor);
        DoorCloseCommand livingRoomDoorCloseCommand = new DoorCloseCommand(livingRoomDoor);

        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, livingLightOnCommand, livingLightOffCommand);
        remoteControl.setCommand(3, kitchenDoorOpenCommand, kitchenDoorCloseCommand);
        remoteControl.setCommand(4, livingRoomDoorOpenCommand, livingRoomDoorCloseCommand);

        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.onButtonPressed(3);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(4);
        remoteControl.onButtonPressed(5);
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);
        remoteControl.offButtonPressed(3);
        remoteControl.offButtonPressed(4);
        remoteControl.offButtonPressed(5);

        System.out.println(remoteControl.toString());
    }
}
