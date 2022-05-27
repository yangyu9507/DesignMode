package com.yaron.command.command;

import com.yaron.command.command.impl.NoCommand;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class RemoteController {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int idx = 0; idx < 5; idx++) {
            onCommands[idx] = new NoCommand();
            offCommands[idx] = new NoCommand();
        }
    }

    public void setCommand(int no,Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onWasPushed(int no){
        onCommands[no].execute();

        undoCommand = onCommands[no];

    }

    public void offWasPushed(int no){
        offCommands[no].execute();

        undoCommand = offCommands[no];

    }

    public void undo(){
        System.out.println("撤销............");
        undoCommand.undo();
    }
}
