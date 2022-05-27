package com.yaron.mediator.colleague;

import com.yaron.mediator.mediator.Mediator;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 同事抽象类
 */
public abstract class Colleague {

    protected Mediator mediator;

    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
