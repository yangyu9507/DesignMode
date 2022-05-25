package com.yaron.bridge;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("Mi 开机");
    }

    @Override
    public void close() {
        System.out.println("Mi 关机");
    }

    @Override
    public void call() {
        System.out.println("Mi 打电话");
    }
}
