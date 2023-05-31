package com.yaron.factory.lagou.factorymethod.factory;

import com.yaron.factory.lagou.factorymethod.product.IProduct;
import com.yaron.factory.lagou.factorymethod.product.impl.ProductA;
import com.yaron.factory.lagou.factorymethod.product.impl.ProductB;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description 核心工厂类
 */
public class ProductFactory {

    public static IProduct getProuct(String name){

        if ("a".equalsIgnoreCase(name)){
            return new ProductA();
        }
        return new ProductB();
    }
}
