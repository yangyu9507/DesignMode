package com.yaron.state.state;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public abstract class State {

    /**
     * 扣积分
     */
    public abstract void deduceScore();

    /**
     * 是否抽中
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize ();
}
