package com.yaron.singleton.type6;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 双重检查.txt Double-Check
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}

class Singleton {

    /**
     * volatile 轻量级synchronized,数据一改变,就会刷新到主内存当中
     */
    private static volatile Singleton instance;

    private Singleton() {
    }

    /**
     * 双重检查.txt
     *
     * @return
     */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}