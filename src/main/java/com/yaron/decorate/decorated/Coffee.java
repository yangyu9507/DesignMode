package com.yaron.decorate.decorated;

import com.yaron.decorate.Drink;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 咖啡的共同特点 抽取出来
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
