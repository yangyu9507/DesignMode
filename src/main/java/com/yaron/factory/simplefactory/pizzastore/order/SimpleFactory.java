package com.yaron.factory.simplefactory.pizzastore.order;

import com.yaron.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.yaron.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.yaron.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.yaron.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description 简单工厂类
 */
public class SimpleFactory {

    /**
     * 根据orderType返回 Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式....");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }  else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
