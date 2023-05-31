package com.yaron.prototype.lagou;

import com.yaron.prototype.lagou.impl.ProtypeA;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtypeA source = new ProtypeA();
        System.out.println(source);

        PrototypeInterface clone = source.clone();
        System.out.println(clone);



    }
}
