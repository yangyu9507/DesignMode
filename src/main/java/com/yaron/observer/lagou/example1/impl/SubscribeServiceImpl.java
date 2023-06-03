package com.yaron.observer.lagou.example1.impl;

import com.yaron.observer.lagou.example1.SubscribeService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class SubscribeServiceImpl implements SubscribeService {

    @Override
    public void notify(String acct, double amt) {

        log.info("======== 接到通知: 账户:{} 账单:{}", acct, amt);
    }

}
