package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Stereo {

    private Stereo() {
    }

    public static Stereo getInstance() {
        return new Stereo();
    }

    public void on() {
        System.out.println("立体声 on");
    }

    public void up() {
        System.out.println("立体声 up");
    }

    public void off() {
        System.out.println("立体声 off");
    }

}
