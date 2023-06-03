package com.yaron.decorate.lagou.example1.decorator;

import com.yaron.decorate.lagou.example1.ComponentService;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 装饰器
 */
public class BaseDecorator implements ComponentService {

    private ComponentService wrapper;

    public BaseDecorator(ComponentService wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void excute() {
        wrapper.excute();
    }

}
