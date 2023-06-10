package com.yaron.decorate.decorated.impl;

import com.yaron.decorate.decorated.Coffee;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class EspressoCoffee extends Coffee {

    public EspressoCoffee() {
        setDesc("意大利咖啡");
        setPrice(6.6f);
    }
}
