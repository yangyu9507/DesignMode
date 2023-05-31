package com.yaron.prototype.lagou.impl;

import com.yaron.prototype.lagou.PrototypeInterface;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description
 */
public class ProtypeB implements PrototypeInterface {

    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        System.out.println("Cloning new Object: B ");
        return (ProtypeB)super.clone();
    }
}
