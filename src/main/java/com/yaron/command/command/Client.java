package com.yaron.command.command;

import com.yaron.command.command.impl.LightOffCommand;
import com.yaron.command.command.impl.LightOnCommand;
import com.yaron.command.command.impl.TvOffCommand;
import com.yaron.command.command.impl.TvOnCommand;
import com.yaron.command.command.receiver.LightReceiver;
import com.yaron.command.command.receiver.TvReceiver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        LightReceiver receiver = new LightReceiver();

        controller.setCommand(0, new LightOnCommand(receiver),new LightOffCommand(receiver));

        controller.onWasPushed(0);
        controller.offWasPushed(0);

        System.out.println("-----------------------------------");
        controller.undo();


        System.out.println("-------------------TV ----------------");
        TvReceiver tvReceiver = new TvReceiver();
        controller.setCommand(1, new TvOnCommand(tvReceiver),new TvOffCommand(tvReceiver));

        controller.onWasPushed(1);
        controller.offWasPushed(1);

        controller.undo();
        
    }
}
