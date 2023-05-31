package com.yaron.prototype.lagou.impl;

import com.yaron.prototype.lagou.PrototypeInterface;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description
 */

public class ProtypeA implements PrototypeInterface {

    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        System.out.println("Cloning new Object: A ");
        return (ProtypeA)super.clone();
    }
}
