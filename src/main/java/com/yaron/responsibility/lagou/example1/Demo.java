package com.yaron.responsibility.lagou.example1;

import com.yaron.responsibility.lagou.example1.impl.HandlerA;
import com.yaron.responsibility.lagou.example1.impl.HandlerB;
import com.yaron.responsibility.lagou.example1.impl.HandlerC;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        Handler hA = new HandlerA();
        Handler hB = new HandlerB();
        Handler hC = new HandlerC();

        hA.setNext(hB);
        hB.setNext(hC);
        Request req = new Request();
        req.setData("请求数据ABCDEF");

        hA.handle(req);
    }
}
