package com.yaron.command.weaver.service;

import com.yaron.command.weaver.entity.User;
import com.yaron.command.weaver.executor.CommandExecutor;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Service {

    protected EngineConfiguration engineConfiguration;

    protected CommandExecutor commandExecutor;

    protected User user;

    public Service() {
    }

    public Service(EngineConfiguration engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    public EngineConfiguration getEngineConfiguration() {
        return engineConfiguration;
    }

    public void setEngineConfiguration(EngineConfiguration engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    public CommandExecutor getCommandExecutor() {
        return commandExecutor;
    }

    public void setCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
