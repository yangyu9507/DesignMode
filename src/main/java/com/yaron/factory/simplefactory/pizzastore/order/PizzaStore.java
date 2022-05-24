package com.yaron.factory.simplefactory.pizzastore.order;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class PizzaStore {

    public static void main(String[] args) {

        new OrderPizza(new SimpleFactory());



    }
}
