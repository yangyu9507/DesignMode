package com.yaron.flyweight.lagou.impl;

import com.yaron.flyweight.lagou.Flyweight;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 非共享的具体享元类
 */
@Slf4j
public class UnsharedConcreteFlyweight implements Flyweight {

    private String uniquekey;

    public UnsharedConcreteFlyweight(String uniquekey) {
        this.uniquekey = uniquekey;
    }

    @Override
    public void operation(Integer state) {

        log.info("====== 使用不共享的对象, 内部状态: {} 外部状态:{}", uniquekey, state);
    }
}
