package com.yaron.decorate;

import com.yaron.decorate.decorated.impl.LongBlack;
import com.yaron.decorate.decorator.impl.Milk;
import com.yaron.decorate.decorator.impl.Soy;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class CoffeeClient {

    public static void main(String[] args) {
        Drink drinkOrder = new LongBlack();


        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

        drinkOrder = new Milk(drinkOrder);

        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

        drinkOrder = new Soy(drinkOrder);

        System.out.println("描述: " + drinkOrder.getDesc());
        System.out.println("价格: " + drinkOrder.cost());

    }
}
