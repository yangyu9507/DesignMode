package com.yaron.state.lagou.example2.impl;

import com.yaron.state.lagou.example2.PackageContext;
import com.yaron.state.lagou.example2.PackageState;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class WarehouseProcessing implements PackageState {

    public static WarehouseProcessing getInstance() {
        return new WarehouseProcessing();
    }

    /**
     * 包裹的状态
     * <p>
     * 1 - 已下单
     * 2 - 仓库处理中
     * 3 - 运输中
     * 4 - 派送中
     * 5 - 待取件
     * 6 - 已签收
     *
     * @param context
     */
    @Override
    public void updateState(PackageContext context) {

        log.info(" 2- Package is WarehouseProcessing...");
        context.setCurrentState(InTransition.getInstance());
    }
}
