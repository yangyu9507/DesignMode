package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description 爆米花机
 */
public class Popcorn {

    private Popcorn() {}

    public static Popcorn getInstance() {
        return new Popcorn();
    }

    public void on() {
        System.out.println("爆米花 on");
    }

    public void pop() {
        System.out.println("爆米花 pop");
    }

    public void off() {
        System.out.println("爆米花 off");
    }
}
