package com.yaron.singleton.type4;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 懒汉式(线程安全|效率太低)
 */
public class SingletonTest04 {

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

    /**
     * 同步处理
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (null == instance) instance = new Singleton();
        return instance;
    }

}