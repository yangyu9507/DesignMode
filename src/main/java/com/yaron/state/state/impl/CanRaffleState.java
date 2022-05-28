package com.yaron.state.state.impl;

import com.yaron.state.RaffleActivity;
import com.yaron.state.state.State;

import java.util.Random;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 可以抽奖
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceScore() {

        System.out.println("已经扣过积分了...");
    }

    @Override
    public boolean raffle() {
        System.out.println("====================== 开始抽奖 ======================");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {

            System.out.println("抽中奖了...");
            activity.setState(activity.getDispenseState());
            return true;
        }

        activity.setState(activity.getNoRaffleState());
        System.out.println("没抽中奖...");
        return false;
    }


    @Override
    public void dispensePrize() {
        System.out.println("没中奖,不能发放奖品");
    }
}
