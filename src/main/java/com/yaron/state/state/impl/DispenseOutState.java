package com.yaron.state.state.impl;

import com.yaron.state.RaffleActivity;
import com.yaron.state.state.State;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 奖品发完了  所有活动结束了
 */
public class DispenseOutState extends State {


    RaffleActivity activity;


    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }



    @Override
    public void deduceScore() {

        System.out.println("奖品发完了,再见.");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发完了,再见.");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了,再见.");
    }
}
