package com.yaron.mediator.mediator.impl;

import com.yaron.mediator.colleague.Colleague;
import com.yaron.mediator.colleague.impl.AlarmColleague;
import com.yaron.mediator.colleague.impl.CoffeeMachineColleague;
import com.yaron.mediator.colleague.impl.CurtainsColleague;
import com.yaron.mediator.colleague.impl.TVColleague;
import com.yaron.mediator.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class ConcreteMediator extends Mediator {

    private Map<String,Colleague> colleagueMap;
    private Map<String,String> interMap;


    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {

        colleagueMap.put(colleagueName, colleague);

         if (colleague instanceof AlarmColleague){
             interMap.put("Alarm",colleagueName);
         } else if (colleague instanceof CoffeeMachineColleague) {
             interMap.put("CoffeeMachine",colleagueName);
         } else if (colleague instanceof TVColleague) {
             interMap.put("TV",colleagueName);
         } else if (colleague instanceof CurtainsColleague) {
             interMap.put("Curtains",colleagueName);
         }
    }

    /**
     * 根据得到的消息，完成对应的任务
     * 中介者在这个方法 协调各个具体的同事对象  完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {

        Colleague colleague = colleagueMap.get(colleagueName);

        if (colleague instanceof AlarmColleague){

            if (stateChange == 0){
                CoffeeMachineColleague coffeeMachine = (CoffeeMachineColleague)colleagueMap.get(interMap.get("CoffeeMachine"));
                coffeeMachine.startCoffee();

                TVColleague tvColleague = (TVColleague)colleagueMap.get(interMap.get("TV"));
                tvColleague.startTV();
            } else if (stateChange == 1) {
                TVColleague tvColleague = (TVColleague)colleagueMap.get(interMap.get("TV"));
                tvColleague.stopTV();
            }

        } else if (colleague instanceof CoffeeMachineColleague) {
            CurtainsColleague curtains = (CurtainsColleague)colleagueMap.get(interMap.get("Curtains"));
            curtains.upCurtains();
        } else if (colleague instanceof TVColleague){
            // TODO 电视处理
        } else if (colleague instanceof CurtainsColleague){
            // 窗帘处理
        }
    }

    @Override
    public void sendMessage() {


    }
}
