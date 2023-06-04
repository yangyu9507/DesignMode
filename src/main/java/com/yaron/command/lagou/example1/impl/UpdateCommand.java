package com.yaron.command.lagou.example1.impl;

import com.yaron.command.lagou.example1.Command;
import com.yaron.command.lagou.example1.Receiver;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description 具体命令类
 */
public class UpdateCommand implements Command {

    private final Receiver receiver;

    public UpdateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.update();
    }
}
