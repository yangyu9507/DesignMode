package com.yaron.command.weaver.executor;

import com.yaron.command.weaver.Command;
import com.yaron.command.weaver.entity.CommandConfig;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface CommandExecutor {

    CommandConfig getDefaultConfig();

    <T> T execute(CommandConfig commandConfig, Command<T> command);

    <T> T execute(Command<T> command);
}
