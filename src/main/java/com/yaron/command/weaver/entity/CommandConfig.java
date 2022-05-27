package com.yaron.command.weaver.entity;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class CommandConfig {

    private boolean contextReusePossible;

    public CommandConfig() {
        this.contextReusePossible = true;
    }

    public CommandConfig(boolean contextReusePossible) {
        this.contextReusePossible = contextReusePossible;
    }

    public boolean isContextReusePossible() {
        return contextReusePossible;
    }

    public void setContextReusePossible(boolean contextReusePossible) {
        this.contextReusePossible = contextReusePossible;
    }
}
