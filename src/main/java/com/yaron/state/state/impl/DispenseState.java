package com.yaron.state.state.impl;

import com.yaron.state.RaffleActivity;
import com.yaron.state.state.State;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 发放奖品的状态
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceScore() {
        System.out.println("发奖中, 不能扣除积分....");
    }

    @Override
    public boolean raffle() {

        System.out.println("发奖中.不能抽奖..");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {

            System.out.println("奖品还有,你也抽到了...");
            activity.setState(activity.getNoRaffleState());
        } else {

            System.out.println("奖品已经发完了...你领不到了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
