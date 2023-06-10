package com.yaron.decorate.decorator;

import com.yaron.decorate.Drink;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Decorator extends Drink {

    /**
     * 被装饰者
     */
    private Drink drink;


    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // super.getPrice() 装饰者的价格     调料的价格
        // drink.cost()   被装饰者的价格   咖啡的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        // drink.getDesc() 被装饰者的描述
        return super.getDesc() + " " + super.getPrice() + " && " + drink.getDesc();
    }
}
