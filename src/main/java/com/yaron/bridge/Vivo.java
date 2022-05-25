package com.yaron.bridge;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo 开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo 关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo 打电话");
    }
}
