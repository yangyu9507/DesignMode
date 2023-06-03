package com.yaron.observer.lagou.example1.impl;

import com.google.common.collect.Lists;
import com.yaron.observer.lagou.example1.SubscribeService;
import com.yaron.observer.lagou.example1.Publisher;

import java.util.List;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class PublisherImpl implements Publisher {

    private String acct;
    private double balance;
    private List<SubscribeService> subscribeServiceList;

    public PublisherImpl(String acct, double balance) {
        this.acct = acct;
        this.balance = balance;
        this.subscribeServiceList = Lists.newArrayList();
    }

    @Override
    public boolean addObserver(SubscribeService subscribeService) {
        return subscribeServiceList.add(subscribeService);
    }

    @Override
    public boolean removeObserver(SubscribeService subscribeService) {
        return subscribeServiceList.remove(subscribeService);
    }

    @Override
    public void notify(double amt) {

        balance -= amt;
        if (balance < 0) overdrawn();
    }

    private void overdrawn(){
        subscribeServiceList.forEach(
                subscribeService -> subscribeService.notify(acct, balance)
        );
    }


}
