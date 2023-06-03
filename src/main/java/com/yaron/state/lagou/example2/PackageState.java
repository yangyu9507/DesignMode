package com.yaron.state.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public interface PackageState {

    /**
     * 包裹的状态
     *
     *  1 - 已下单
     *  2 - 仓库处理中
     *  3 - 运输中
     *  4 - 派送中
     *  5 - 待取件
     *  6 - 已签收
     */
    void updateState(PackageContext context);
}
