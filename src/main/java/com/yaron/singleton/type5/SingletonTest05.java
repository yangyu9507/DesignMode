package com.yaron.singleton.type5;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 懒汉式(线程安全|同步代码块)  跟type3一样，会产生线程安全问题
 */
public class SingletonTest05 {

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
    public static  Singleton getInstance() {
        if (null == instance) {
             synchronized (Singleton.class) {
                 instance = new Singleton();
             }
        }
        return instance;
    }

}