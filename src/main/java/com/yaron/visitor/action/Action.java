package com.yaron.visitor.action;

import com.yaron.visitor.person.impl.Man;
import com.yaron.visitor.person.impl.Woman;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class Action {

    public abstract void getManRes(Man man);

    public abstract void getWomanRes(Woman woman);

}
