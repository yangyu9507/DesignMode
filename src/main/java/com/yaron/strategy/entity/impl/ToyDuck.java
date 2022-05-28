package com.yaron.strategy.entity.impl;

import com.yaron.strategy.entity.Duck;
import com.yaron.strategy.service.FlyBehavior;
import com.yaron.strategy.service.QuackBehavior;
import com.yaron.strategy.service.impl.NoFlyBehavior;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();

    }
}
