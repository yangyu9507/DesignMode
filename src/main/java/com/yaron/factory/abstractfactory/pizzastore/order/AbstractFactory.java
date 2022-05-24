package com.yaron.factory.abstractfactory.pizzastore.order;

import com.yaron.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 抽象工厂类
 */
public interface AbstractFactory {

    /**
     * 工厂子类具体实现
     *
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);

}
