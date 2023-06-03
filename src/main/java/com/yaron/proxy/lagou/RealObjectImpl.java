package com.yaron.proxy.lagou;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class RealObjectImpl implements RealObject{
    @Override
    public void doSomeThing() {

log.info("-------- 真实对象打印输出");
    }
}
