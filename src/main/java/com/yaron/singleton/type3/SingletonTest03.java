package com.yaron.singleton.type3;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 懒汉式(线程不安全)
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}


class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == instance) instance = new Singleton();
        return instance;
    }

}