package com.yaron.bridge.lagou.example1.impl;

import com.yaron.bridge.lagou.example1.AbstractBehavior;
import com.yaron.bridge.lagou.example1.AbstractEntity;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class DetailEntityA extends AbstractEntity {

    public DetailEntityA(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.abstractBehavior.operation1();
    }
}
