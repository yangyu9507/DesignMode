package com.yaron.singleton.type2;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 饿汉式(静态代码块)
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}


class Singleton {

    private Singleton() {
    }

    private static Singleton instance;


    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
