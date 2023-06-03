package com.yaron.decorate.lagou.example1.decorator.impl;

import com.yaron.decorate.lagou.example1.ComponentService;
import com.yaron.decorate.lagou.example1.decorator.BaseDecorator;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 具体装饰器B
 */
public class DecoratorB extends BaseDecorator {

    public DecoratorB(ComponentService wrapper) {
        super(wrapper);
    }

    @Override
    public void excute() {
        super.excute();
    }
}
