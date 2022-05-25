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
    private Drink obj;


    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // super.getPrice() 装饰者的价格     调料的价格
        // obj.cost()   被装饰者的价格   咖啡的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        // obj.getDesc() 被装饰者的描述
        return super.getDesc() + " " + super.getPrice() + " && " + obj.getDesc();
    }
}
