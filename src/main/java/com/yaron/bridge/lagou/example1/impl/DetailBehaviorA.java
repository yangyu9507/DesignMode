package com.yaron.bridge.lagou.example1.impl;

import com.yaron.bridge.lagou.example1.AbstractBehavior;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class DetailBehaviorA extends AbstractBehavior {
    @Override
    public void operation1() {
        System.out.println("DetailBehaviorA operation1 ");
    }

    @Override
    public void operation2() {
        System.out.println("DetailBehaviorA operation2 ");
    }
}
