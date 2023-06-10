package com.yaron.decorate;

import lombok.Data;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
@Data
public abstract class Drink {

    private String desc;

    private float price = 0.0F;

    /**
     * 计算费用
     * @return
     */
    public abstract float cost();

}
