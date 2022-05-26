package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Projector {

    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("投影仪 on");
    }

    public void focus() {
        System.out.println("投影仪 focus...");
    }

    public void off() {
        System.out.println("投影仪 off");
    }

}
