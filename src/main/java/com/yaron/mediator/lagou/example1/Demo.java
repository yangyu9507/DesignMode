package com.yaron.mediator.lagou.example1;

import com.yaron.mediator.lagou.example1.impl.ComponentA;
import com.yaron.mediator.lagou.example1.impl.ComponentB;
import com.yaron.mediator.lagou.example1.impl.MediatorImpl;
import org.checkerframework.checker.units.qual.C;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Component a = new ComponentA(mediator);
        a.exec("key-A");
        Component b = new ComponentB(mediator);
        b.exec("key-B");
    }
}
