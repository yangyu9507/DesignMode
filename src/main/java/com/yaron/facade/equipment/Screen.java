package com.yaron.facade.equipment;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Screen {

    private static Screen instance = new Screen();
    private Screen(){

    }

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("屏幕 上升");
    }

    public void down(){
        System.out.println("屏幕 下降");
    }
}
