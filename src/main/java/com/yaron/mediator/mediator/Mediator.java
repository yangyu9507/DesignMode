package com.yaron.mediator.mediator;

import com.yaron.mediator.colleague.Colleague;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public abstract class Mediator {

    /**
     * 将 同事 加入到 中介的管理 中
     * @param colleagueName
     * @param colleague
     */
    public abstract void register(String colleagueName, Colleague colleague);

    /**
     * 接收消息，，具体 的同事对象发出
     * @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange,String colleagueName);

    public abstract void sendMessage();

}
