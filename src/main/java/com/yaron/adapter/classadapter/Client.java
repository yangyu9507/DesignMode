package com.yaron.adapter.classadapter;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=======  类适配器模式  =======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
