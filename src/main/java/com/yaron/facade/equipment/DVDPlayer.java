package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void play(){
        System.out.println("DVD play");
    }

    public void pause(){
        System.out.println("DVD pause");
    }

    public void off(){
        System.out.println("DVD off");
    }
}
