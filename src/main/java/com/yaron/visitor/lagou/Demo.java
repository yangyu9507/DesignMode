package com.yaron.visitor.lagou;

import com.google.common.collect.Lists;
import com.yaron.visitor.lagou.impl.ElementA;
import com.yaron.visitor.lagou.impl.ElementB;
import com.yaron.visitor.lagou.impl.VisitorImpl;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Demo {


    public static void main(String[] args) {


        ElementA elementA = new ElementA();
        elementA.setState(11);

        ElementB elementB = new ElementB();
        elementB.setState(22);

        Lists.newArrayList(
                elementA,elementB
        ).forEach(ele -> ele.accept(new VisitorImpl()));

    }
}
