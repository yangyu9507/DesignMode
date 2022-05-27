package com.yaron.mediator.colleague.impl;

import com.yaron.mediator.colleague.Colleague;
import com.yaron.mediator.mediator.Mediator;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 具体的同事类
 */
public class AlarmColleague extends Colleague {
    public AlarmColleague(Mediator mediator, String name) {
        super(mediator, name);
        // 创建同事时，将 自身 放到 ConcreteMediator 对象中【集合】
        mediator.register(name, this);
    }


    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }


    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
