package com.yaron.observer.observer;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class Observer {

    /**
     * 温度
     */
    protected float temperature;

    /**
     * 气压
     */
    protected float pressure;

    /**
     * 湿度
     */
    protected float humidity;

    public void display(){
        System.out.println(name() + " --------------> 今天天气 # temperatrue: " + temperature + " # pressure: " + pressure + " # humidity: " + humidity);
    }

    public abstract String name();

    public void update(float temperatrue, float pressure, float humidity) {
        this.temperature = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
