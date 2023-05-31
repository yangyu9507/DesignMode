package com.yaron.factory.lagou.factorymethod;

import com.yaron.factory.lagou.factorymethod.factory.ProductFactory;
import com.yaron.factory.lagou.factorymethod.product.IProduct;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description
 */
public class Client {

    public static void main(String[] args) {
        IProduct iProduct = ProductFactory.getProuct("a");
        iProduct.apply();
        iProduct = ProductFactory.getProuct("b");
        iProduct.apply();

    }
}
