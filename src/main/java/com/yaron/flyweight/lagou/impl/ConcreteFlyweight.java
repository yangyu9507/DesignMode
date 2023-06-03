package com.yaron.flyweight.lagou.impl;

import com.yaron.flyweight.lagou.Flyweight;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 共享的具体享元类
 */
@Slf4j
public class ConcreteFlyweight implements Flyweight {

    private String uniqueKey;

    public ConcreteFlyweight(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    @Override
    public void operation(Integer state) {
        log.info("====== 享元内部状态: {} 外部状态:{}", uniqueKey, state);
    }
}
