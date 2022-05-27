package com.yaron.visitor.person.impl;

import com.yaron.visitor.action.Action;
import com.yaron.visitor.person.Person;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Woman extends Person {

    /**
     * 1.这里使用了双分派,即首先在客户端程序中,将具体状态作为参数传递Woman中 （第一次分派）
     * 2.然后woman 类调用 作为参数的 "具体方法" 中方法 getWomanResult,同时将自己(this)作为参数传入，
     *   完成第二次的分派
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomanRes(this);
    }
}
