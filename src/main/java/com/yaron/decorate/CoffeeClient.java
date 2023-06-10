package com.yaron.decorate;

import com.yaron.decorate.decorated.impl.AmericanoCoffee;
import com.yaron.decorate.decorator.impl.MilkDecorator;
import com.yaron.decorate.decorator.impl.SoyDecorator;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class CoffeeClient {

    public static void main(String[] args) {
        Drink drinkOrder = new AmericanoCoffee();


        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

        drinkOrder = new MilkDecorator(drinkOrder);

        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

        drinkOrder = new SoyDecorator(drinkOrder);

        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

    }
}
