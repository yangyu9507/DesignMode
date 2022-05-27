package com.yaron.observer;

import com.yaron.observer.observer.impl.BaiduObserver;
import com.yaron.observer.observer.impl.ByteDanceObserver;
import com.yaron.observer.observer.impl.TencentObserver;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {

        // 被订阅者
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        // 注入观察者
        weatherDataSubject.registerObserver(new TencentObserver());
        weatherDataSubject.registerObserver(new BaiduObserver());
        weatherDataSubject.registerObserver(new ByteDanceObserver());
        // 通知 观察者
        weatherDataSubject.setData(1,2,3);
    }
}
