package com.yaron.singleton.type1;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 饿汉式(静态常量)
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}


class Singleton {

    private Singleton() {
    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
