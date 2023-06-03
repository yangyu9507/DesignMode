package com.yaron.strategy.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 促销策略接口
 */
public interface PromotionStrategyService {


    /**
     * 返回 1 代表 可以参加满减活动
     * 返回 2 代表 可以参加 N折优惠活动
     * 返回 3 代表 可以参加 M元秒杀活动
     *
     * @param skuId
     * @return
     */
    Integer recommand(String skuId);

}
