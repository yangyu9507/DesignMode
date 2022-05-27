package com.yaron.command.command.impl;

import com.yaron.command.command.Command;
import com.yaron.command.command.receiver.LightReceiver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class LightOffCommand implements Command {


    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {

        lightReceiver.off();
    }

    @Override
    public void undo() {

        lightReceiver.on();
    }
}
