package com.yaron.bridge;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    protected void open() {
        super.open();
        System.out.println("直立手机");
    }

    protected void close() {
        super.close();
        System.out.println("直立手机");
    }

    protected void call() {
        super.call();
        System.out.println("直立手机");
    }


}
