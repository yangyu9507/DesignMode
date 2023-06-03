package com.yaron.bridge.lagou.example1.impl;

import com.yaron.bridge.lagou.example1.AbstractBehavior;
import com.yaron.bridge.lagou.example1.AbstractEntity;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class DetailEntityB extends AbstractEntity {
    public DetailEntityB(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.abstractBehavior.operation2();
    }
}
