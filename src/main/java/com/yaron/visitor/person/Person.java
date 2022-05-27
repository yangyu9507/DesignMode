package com.yaron.visitor.person;

import com.yaron.visitor.action.Action;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class Person {

    /**
     * 提供一个方法,让访问者访问
     * @param action
     */
    public abstract void accept(Action action);
}
