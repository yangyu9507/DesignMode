package com.yaron.template;

import com.yaron.template.impl.*;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("======= 红豆豆浆 ==============");
        SoyaMilk r = new RedBeanSoyaMilk();
        r.make();

        System.out.println("======= 花生豆浆 ==============");
        SoyaMilk p = new PeanutSoyaMilk();
        p.make();

        System.out.println("======= 纯豆浆 ==============");
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();

        System.out.println("======= 代码执行1 ==============");
        ExecuteTimeService service1 = new ExecuteTimeServiceImpl1();
        service1.getExecuteTime();
        System.out.println("======= 代码执行2 ==============");
        ExecuteTimeService service2 = new ExecuteTimeServiceImpl2();
        service2.getExecuteTime();
    }
}
