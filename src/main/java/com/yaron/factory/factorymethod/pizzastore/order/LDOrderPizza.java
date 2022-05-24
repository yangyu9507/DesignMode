package com.yaron.factory.factorymethod.pizzastore.order;

import com.yaron.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
