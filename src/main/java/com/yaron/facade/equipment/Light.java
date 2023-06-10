package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Light {

    private Light() {
    }

    public static Light getInstance() {
        return new Light();
    }

    public void on() {
        System.out.println("灯光 on");
    }

    public void dim() {
        System.out.println("灯光 dim");
    }

    public void bright() {
        System.out.println("灯光 bright");
    }

    public void off() {
        System.out.println("灯光 off");
    }
}
