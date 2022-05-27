package com.yaron.observer;

import com.yaron.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class WeatherDataSubject implements Subject<Observer> {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    private List<Observer> observerList;

    public WeatherDataSubject() {
        observerList = new ArrayList<>();
    }


    public void setData(float temperature,float pressure, float humidity){
        setTemperature(temperature);
        setPressure(pressure);
        setHumidity(humidity);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
       observerList.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {

        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
         observerList.forEach(item -> item.update(getTemperature(),getTemperature(),getHumidity()));
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
