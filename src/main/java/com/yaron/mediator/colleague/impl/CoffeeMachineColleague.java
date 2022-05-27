package com.yaron.mediator.colleague.impl;

import com.yaron.mediator.colleague.Colleague;
import com.yaron.mediator.mediator.Mediator;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class CoffeeMachineColleague extends Colleague {


    public CoffeeMachineColleague(Mediator mediator, String name) {
        super(mediator, name);
        // 创建同事时，将 自身 放到 ConcreteMediator 对象中【集合】
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
         this.getMediator().getMessage(stateChange,this.name);
    }

    public void startCoffee() {
        System.out.println("咖啡机开始煮咖啡....");
    }

    public void finishCoffee(){
        System.out.println("咖啡煮好了...");
        sendMessage(0);
    }
}
