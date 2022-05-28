package com.yaron.state.money.state;

import com.yaron.state.money.Context;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public interface State {

    /**
     * 电审
     * @param context
     */
    void checkEvent(Context context);

    /**
     * 电审失败
     * @param context
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     *
     * @param context
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     * @param context
     */
    void acceptOrderEvent(Context context);

    /**
     * 无从接单失效
     * @param context
     */
    void noPeopleAcceptEvent(Context context);

    /**
     * 付款
     * @param context
     */
    void payOrderEvent(Context context);

    /**
     * 接单有人支付失效
     * @param context
     */
    void orderFailureEvent(Context context);

    /**
     * 反馈
     * @param context
     */
    void feedBackEvent(Context context);

    String getCurrentState();
}
