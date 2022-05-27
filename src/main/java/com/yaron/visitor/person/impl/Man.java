package com.yaron.visitor.person.impl;

import com.yaron.visitor.action.Action;
import com.yaron.visitor.person.Person;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManRes(this);
    }
}
