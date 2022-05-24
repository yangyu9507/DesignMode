package com.yaron.factory.factorymethod.pizzastore.order;

import com.yaron.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.yaron.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.yaron.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
