package com.yaron.command.command.impl;

import com.yaron.command.command.Command;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description 没有任何命令.  用于初始化每个 命令
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
