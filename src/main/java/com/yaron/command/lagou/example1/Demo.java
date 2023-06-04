package com.yaron.command.lagou.example1;

import com.yaron.command.lagou.example1.impl.CreateCommand;
import com.yaron.command.lagou.example1.impl.DeleteCommand;
import com.yaron.command.lagou.example1.impl.ReceiverImpl;
import com.yaron.command.lagou.example1.impl.UpdateCommand;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Demo {

    public static void main(String[] args) {

        Receiver receiver = new ReceiverImpl();
        Invoker invoker = new Invoker();
        invoker.setCommand(new CreateCommand(receiver));
        invoker.setCommand(new UpdateCommand(receiver));
        invoker.setCommand(new DeleteCommand(receiver));

        invoker.run();
    }
}
