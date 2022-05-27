package com.yaron.command.weaver.entity;

import com.yaron.command.weaver.Command;
import com.yaron.command.weaver.service.impl.EngineConfigurationImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class CommandContext {

    private static Logger log = LoggerFactory.getLogger(CommandContext.class);

    protected Command<?> command;

    protected Throwable exception;

    protected EngineConfigurationImpl engineCfg;

    protected Map<String, Object> attributes;

    protected boolean reused;

    public CommandContext(Command<?> command, EngineConfigurationImpl endineCfg) {
        this.command = command;
        this.engineCfg = engineCfg;
    }

    public void exception(Throwable exception) {
        if (this.exception == null) {
            this.exception = exception;

        } else {
            log.error("命令上下文中的屏蔽异常。具体原因, 请参见以下内容。\n", exception);
        }
    }

    protected void logException() {
    }

    public void close() {
        //TODO
    }

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public Object getAttribute(String key) {
        return attributes.get(key);
    }
}
