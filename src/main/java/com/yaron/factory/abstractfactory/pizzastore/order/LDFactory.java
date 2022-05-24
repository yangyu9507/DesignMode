package com.yaron.factory.abstractfactory.pizzastore.order;

import com.yaron.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.yaron.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.yaron.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class LDFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂模式......");
        if ("cheese".equals(orderType)){
            return new LDCheesePizza();
        } else if ("pepper".equals(orderType)){
            return new LDPepperPizza();
        }
        return null;
    }
}
