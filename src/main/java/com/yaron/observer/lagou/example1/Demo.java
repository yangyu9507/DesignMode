package com.yaron.observer.lagou.example1;

import com.yaron.observer.lagou.example1.impl.SubscribeServiceImpl;
import com.yaron.observer.lagou.example1.impl.PublisherImpl;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        Publisher publisher = new PublisherImpl("test123", 10.00);

        SubscribeService bill = new SubscribeServiceImpl();

        publisher.addObserver(bill);
        publisher.notify(11.00);

    }
}
