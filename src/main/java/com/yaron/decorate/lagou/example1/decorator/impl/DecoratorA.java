package com.yaron.decorate.lagou.example1.decorator.impl;

import com.yaron.decorate.lagou.example1.ComponentService;
import com.yaron.decorate.lagou.example1.decorator.BaseDecorator;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 具体装饰器A
 */
public class DecoratorA extends BaseDecorator {
    public DecoratorA(ComponentService wrapper) {
        super(wrapper);
    }

    @Override
    public void excute() {
        super.excute(); // 原本服务执行
        // TODO 后续扩展  在方法执行 之前 之后 都可以
    }
}
