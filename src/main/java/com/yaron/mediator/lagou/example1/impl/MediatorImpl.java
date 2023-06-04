package com.yaron.mediator.lagou.example1.impl;

import com.yaron.mediator.lagou.example1.Mediator;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
@Slf4j
public class MediatorImpl implements Mediator {
    @Override
    public void apply(String key) {

        log.info("最终中介者执行操作 # key: {}",key);
    }
}
