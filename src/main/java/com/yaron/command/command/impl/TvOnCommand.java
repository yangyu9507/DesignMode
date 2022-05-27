package com.yaron.command.command.impl;

import com.yaron.command.command.Command;
import com.yaron.command.command.receiver.TvReceiver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class TvOnCommand implements Command {

    TvReceiver tvReceiver;

 public TvOnCommand(TvReceiver tvReceiver) {
  this.tvReceiver = tvReceiver;
 }


 @Override
    public void execute() {
  tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
