package com.yaron.factory.abstractfactory.pizzastore.order;

import com.yaron.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.yaron.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.yaron.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂模式......");
        if ("cheese".equals(orderType)) {
            return new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            return new BJPepperPizza();
        }
        return null;
    }
}
