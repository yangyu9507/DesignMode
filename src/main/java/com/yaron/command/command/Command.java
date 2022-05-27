package com.yaron.command.command;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface Command {

  void execute();

  void undo();
}
