package com.yaron.strategy.lagou.example1.impl;

import com.yaron.strategy.lagou.example1.Strategy;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 具体策略类
 */
@Slf4j
public class StrategyB implements Strategy {
    
    @Override
    public void operation() {
        log.info("======= StrategyB operation....");
    }
}
