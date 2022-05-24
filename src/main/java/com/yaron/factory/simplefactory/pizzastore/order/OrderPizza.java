package com.yaron.factory.simplefactory.pizzastore.order;

import com.yaron.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class OrderPizza {

    private SimpleFactory simpleFactory;
    Pizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (null == pizza) {
                System.out.println("没有这种pizza");
                break;
            }
            //
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

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
