package com.yaron.factory.factorymethod.pizzastore.order;

import com.yaron.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (null == pizza){
                System.out.println("没有这种pizza..");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 各类: ");
            return reader.readLine();
        } catch (IOException ex) {
            return "";
        }
    }

}
