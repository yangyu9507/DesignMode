package com.yaron.proxy.lagou;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class ProxyObject extends RealObjectImpl{

    @Override
    public void doSomeThing() {
      log.info("============= 通过代理, 执行之前");
        super.doSomeThing();
        log.info("============= 通过代理, 执行之后");
    }
}
