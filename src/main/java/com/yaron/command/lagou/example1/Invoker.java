package com.yaron.command.lagou.example1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Invoker {

    private List<Command> commands = Lists.newArrayList();

    public Invoker setCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void run(){
        commands.forEach(Command::execute);
    }
}
