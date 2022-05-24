package com.yaron.factory.simplefactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class GreekPizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println(" 给制作希腊准备原材料");
    }
}
