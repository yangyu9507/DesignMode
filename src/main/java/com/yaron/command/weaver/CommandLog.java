package com.yaron.command.weaver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface CommandLog {

    /**
     * 是否自动记录日志（必须是command继承才有效）
     */
    boolean isAutoWriteLog();

    /**
     * 记录业务日志
     */
    void writeBizLog();

}
