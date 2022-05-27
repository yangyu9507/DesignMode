package com.yaron.observer;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface Subject<T> {

    /**
     * 注册观察者
     * @param t
     */
    void registerObserver(T t);

    /**
     * 移除观察者
     * @param t
     */
    void unRegisterObserver(T t);

    /**
     * 通知所有 观察者
     */
    void notifyObservers();
}
