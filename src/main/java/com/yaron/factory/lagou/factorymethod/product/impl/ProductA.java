package com.yaron.factory.lagou.factorymethod.product.impl;

import com.yaron.factory.lagou.factorymethod.product.IProduct;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description 具体产品A
 */
public class ProductA implements IProduct {
    @Override
    public void apply() {
        System.out.println("use aaaaa procuct now");
    }
}
