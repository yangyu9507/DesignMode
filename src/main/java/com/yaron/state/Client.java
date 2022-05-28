package com.yaron.state;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 1; i <= 30; i++) {
            System.out.println("第" + i + "次抽奖。。。");
            activity.debuctScore();
            activity.raffle();
            System.out.println("=====================================================================");
        }
    }
}
