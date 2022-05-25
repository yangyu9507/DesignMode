package com.yaron.decorate.decorator.impl;

import com.yaron.decorate.Drink;
import com.yaron.decorate.decorator.Decorator;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f);
    }
}
