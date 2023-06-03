package com.yaron.strategy.lagou.example2.impl;

import com.yaron.strategy.lagou.example2.PromotionStrategyService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description M元秒杀活动
 */
@Slf4j
public class MSpikeStrategy implements PromotionStrategyService {
    /**
     * 返回 1 代表 可以参加满减活动
     * 返回 2 代表 可以参加 N折优惠活动
     * 返回 3 代表 可以参加 M元秒杀活动
     *
     * @param skuId
     * @return
     */
    @Override
    public Integer recommand(String skuId) {
        log.info("======== M元秒杀活动:{}", skuId);
        return 3;
    }
}
