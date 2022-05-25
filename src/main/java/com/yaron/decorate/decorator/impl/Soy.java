package com.yaron.decorate.decorator.impl;

import com.yaron.decorate.Drink;
import com.yaron.decorate.decorator.Decorator;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDesc("豆浆");
        setPrice(1.5f);
    }
}
