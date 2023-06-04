package com.yaron.mediator.lagou.example1;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public abstract class Component {

    private Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void exec(String key);

    public Mediator getMediator() {
        return mediator;
    }
}