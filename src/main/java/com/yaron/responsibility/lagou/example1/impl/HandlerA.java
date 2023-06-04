package com.yaron.responsibility.lagou.example1.impl;

import com.yaron.responsibility.lagou.example1.Handler;
import com.yaron.responsibility.lagou.example1.Request;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
@Slf4j
public class HandlerA implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {

        log.info("HandlerA 执行代码逻辑处理:{}", request.getData());
        request.setData(request.getData().replace("AB",""));
        if (null != next){
            next.handle(request);
        } else {
            log.info("执行结束!");
        }
    }
}
