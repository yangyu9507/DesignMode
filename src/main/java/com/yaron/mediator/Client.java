package com.yaron.mediator;

import com.yaron.mediator.colleague.impl.AlarmColleague;
import com.yaron.mediator.colleague.impl.CoffeeMachineColleague;
import com.yaron.mediator.colleague.impl.CurtainsColleague;
import com.yaron.mediator.colleague.impl.TVColleague;
import com.yaron.mediator.mediator.Mediator;
import com.yaron.mediator.mediator.impl.ConcreteMediator;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        AlarmColleague alarm = new AlarmColleague(mediator, "alarm");
        CoffeeMachineColleague coffee = new CoffeeMachineColleague(mediator, "coffeeMachine");
        CurtainsColleague curtains = new CurtainsColleague(mediator, "curtains");
        TVColleague tv = new TVColleague(mediator, "TV");

        alarm.sendAlarm(0);

        coffee.finishCoffee();
        alarm.sendAlarm(1);
    }
}
