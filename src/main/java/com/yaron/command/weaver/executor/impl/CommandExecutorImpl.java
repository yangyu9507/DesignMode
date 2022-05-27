package com.yaron.command.weaver.executor.impl;

import com.yaron.command.weaver.Command;
import com.yaron.command.weaver.entity.CommandConfig;
import com.yaron.command.weaver.executor.CommandExecutor;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class CommandExecutorImpl implements CommandExecutor {

    protected CommandConfig defaultConfig;

    public CommandExecutorImpl(CommandConfig defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    @Override
    public CommandConfig getDefaultConfig() {
        return null;
    }

    @Override
    public <T> T execute(CommandConfig commandConfig, Command<T> command) {
        return  null;
    }

    @Override
    public <T> T execute(Command<T> command) {
        return execute(defaultConfig, command);
    }
}
