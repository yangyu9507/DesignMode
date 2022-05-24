package com.yaron.singleton.type7;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 静态内部类
 *          1. 当外部类装载的时候, 静态内部类 不会被装载
 *          2. 当调用getInstance时， 静态内部类会被装载，是线程安全的，只会装载一次
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}

class Singleton{
    private Singleton(){

    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
