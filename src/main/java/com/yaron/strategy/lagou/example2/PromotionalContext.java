package com.yaron.strategy.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 实现促销推荐的上下文信息类
 */
public class PromotionalContext {

    private final PromotionStrategyService strategyService;

    public PromotionalContext(PromotionStrategyService strategyService) {
        this.strategyService = strategyService;
    }

    public void recomment(String skuId){
        strategyService.recommand(skuId);
    }
}
