package com.yaron.state.state.impl;

import com.yaron.state.RaffleActivity;
import com.yaron.state.state.State;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 不能抽奖
 */
public class NoRaffleState extends State {

    /**
     * 初始化时传入活动引用 # 扣除积分后改变其状态
     */
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 操作积分
     */
    @Override
    public void deduceScore() {

        System.out.println("扣除50积分成功,可以抽奖了");
        activity.setState(activity.getCanRaffleState());

    }

    @Override
    public boolean raffle() {
        System.out.println("当前不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能抽奖,不能发放奖品");
    }
}
