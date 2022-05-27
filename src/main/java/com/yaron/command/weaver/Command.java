package com.yaron.command.weaver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface Command<T> {

    T execute();

}
