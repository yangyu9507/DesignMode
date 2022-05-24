package com.yaron.singleton.type8;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);

        instance1.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}
